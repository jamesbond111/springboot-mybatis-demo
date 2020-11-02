package com.bili.finance.financemg.controller;

import com.alibaba.fastjson.JSONObject;
import com.bili.finance.financemg.model.entity.User;
import com.bili.finance.financemg.service.UserService;
import com.bili.finance.financemg.model.req.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/user")
@RestController  //一定要用RestController,而不是Controller
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查找所有的用户
     *
     * @return
     */
    @RequestMapping(value = "/findAll")
    public List<User> findAll() {
        List<User> users = userService.findAll();
        return users;
    }

    /**
     * 查找第一个用户
     *
     * @return
     */
    @GetMapping(value = "/findFirst")
    public String findFirst() {
        List<User> users = userService.findAll();
        //将对象转为json格式的字符串
        String jsonStr = JSONObject.toJSONString(users.get(0));
        return jsonStr;
    }

    /**
     * 根据id查找记录
     *
     * @param id
     * @return
     */
    @RequestMapping("/getUser/{id}")
    public User GetUser(@PathVariable int id) {
        return userService.getUserById(id);
    }

    /**
     * 根据name模糊查询用户
     *
     * @RequestBody 直接将post体中的数据反序列化到对象中
     * @Validated 可以对传入的参数进行校验
     */
    @PostMapping("/findUser")
    public User getUserByIdName(@RequestBody @Validated FindUserReq req) {
        return userService.getUserByIdAndName(req.getId(), req.getName());
    }

    @PostMapping("/getUserRange")
    public List<User> getUserByIdName(@RequestBody GetUserRangeReq req) {
        return userService.getUserByIds(req.getIds());
    }

    /**
     * 添加一个用户
     *
     * @param req
     */
    @PostMapping("/addUser")
    public void addUser(@RequestBody AddUserReq req) {
        System.out.println(req.getAge());
        userService.addUser(req.getName(), req.getAge());
    }

    @PostMapping("/insertUser")
    public int insertUser(@RequestBody @Validated AddUserReq req) {
        User user = new User().builder().name(req.getName()).age(req.getAge()).build();
        return userService.insertSelective(user);
    }

    @PostMapping("/updateUser")
    public int insertUser(@RequestBody @Validated UpdateUserReq req) {
        return userService.updateSelective(req);
    }

    @PostMapping("/deleteUser")
    public int deleteUser(@RequestBody @Validated DeleteUserReq req) {
        return userService.deleteUserById(req.getId());
    }
}

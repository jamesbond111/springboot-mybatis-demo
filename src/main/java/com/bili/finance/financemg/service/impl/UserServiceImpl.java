package com.bili.finance.financemg.service.impl;

import com.bili.finance.financemg.model.entity.User;
import com.bili.finance.financemg.mapper.UserMapper;
import com.bili.finance.financemg.service.UserService;
import com.bili.finance.financemg.model.req.UpdateUserReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User getUserById(int userId) {
        return userMapper.getUserById(userId);
    }

    @Override
    public List<User> getUserByIds(List<Integer> userIds) {
        return userMapper.getUserByIds(userIds);
    }

    @Override
    public User getUserByIdAndName(int userId, String userName) {
        return userMapper.getUserByIdAndName(userId, userName);
    }

    @Override
    public void addUser(String userName, int age) {
        userMapper.addUser(userName, age);
    }

    @Override
    public int insertSelective(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public int updateSelective(UpdateUserReq req) {
        User user = userMapper.getUserById(req.getId());
        user.setName(req.getName());
        user.setAge(req.getAge());
        logger.info("the updated obj is {}", user);
        logger.debug("the updated1111 obj is {}", user);
        return userMapper.updateSelective(user);
    }

    @Override
    public int deleteUserById(int userId) {
        return userMapper.deleteById(userId);
    }

}

package com.bili.finance.financemg.service;

import com.bili.finance.financemg.model.entity.User;
import com.bili.finance.financemg.model.req.UpdateUserReq;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User getUserById(int userId);

    List<User> getUserByIds(List<Integer> userIds);

    User getUserByIdAndName(int userId, String userName);

    void addUser(String userName, int age);

    int insertSelective(User user);

    int updateSelective(UpdateUserReq req);

    int deleteUserById(int userId);

}

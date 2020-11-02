package com.bili.finance.financemg.mapper;

import com.bili.finance.financemg.model.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 该mapper是对User的增删改查操作
 * <p>
 * BeanMapper一些基础性的增删改查操作，大多是公共的、重复的逻辑，可以提取出来作为一个公共的接口。
 * 在子接口中实现一些自定义的查询操作即可。
 */
@Mapper
public interface UserMapper {
    List<User> findAll();

    User getUserById(int userId);

    List<User> getUserByIds(@Param("userIds") List<Integer> userIds);

    /**
     * @Param注解中的内容，会作为参数传入到mapper配置文件中
     */
    User getUserByIdAndName(@Param("userId") int userId, @Param("userName") String userName);

    void addUser(@Param("userName") String userName, @Param("age") int age);

    int insertSelective(User user);

    int updateSelective(User user);

    int deleteById(int userId);
}



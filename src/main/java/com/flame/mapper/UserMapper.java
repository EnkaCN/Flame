package com.flame.mapper;

import com.flame.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    /**
     * 增加一个用户
     */
    void addUser(User user);

    /**
     * 清♥退♥退
     */
    void deleteByUserName(@Param("userName") String userName);

    /**
     * 通过条件查询特定的用户
     * @return List<User>
     */
    List<User> selectByCond(@Param("userId") Integer id,
                            @Param("userName") String userName,
                            @Param("userPwd") String userPwd,
                            @Param("userSuper") Boolean userSuper);

    /**
     * 修改用户信息
     */
    void updateUserByName(@Param("userName") String userName,
                          @Param("userPwd") String userPwd,
                          @Param("userSuper") Boolean userSuper);
}

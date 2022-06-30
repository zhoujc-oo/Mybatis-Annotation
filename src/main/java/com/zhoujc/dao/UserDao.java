package com.zhoujc.dao;

import com.zhoujc.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
public interface UserDao {

    @Select("select * from user")
    List<User> allUser();

    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user(id, type, name, description) values (#{id}, #{type}, #{name}, #{description})")
    int addUser(User user);

    @Update("update user set type=#{type}, name=#{name}, description=#{description} where id =#{id}")
    int updateUser(User user);

    @Delete("delete from user where id =#{id}")
    int deleteUser(@Param("id") int id);

}

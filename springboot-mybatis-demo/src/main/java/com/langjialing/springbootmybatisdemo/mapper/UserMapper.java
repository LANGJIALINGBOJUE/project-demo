package com.langjialing.springbootmybatisdemo.mapper;

import com.langjialing.springbootmybatisdemo.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 获取所有用户信息。
     * @return
     */
    @Select("SELECT * FROM user")
    List<User> getAll();

    /**
     * 获取指定ID的用户信息。
     * @param id
     * @return
     */
    @Select("SELECT * FROM user WHERE id = #{id}")
    User getOne(Integer id);

    /**
     * 插入用户。
     * @param user
     */
    @Insert("INSERT INTO user(name,password,age) VALUES(#{name}, #{password}, #{age})")
    void insert(User user);

    /**
     * 更新指定ID的用户信息。
     * @param user
     */
    @Update("UPDATE user SET name=#{name},password=#{password},age=#{age} WHERE id =#{id}")
    void update(User user);

    /**
     * 删除指定ID的用户信息。
     * @param id
     */
    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(Integer id);
}
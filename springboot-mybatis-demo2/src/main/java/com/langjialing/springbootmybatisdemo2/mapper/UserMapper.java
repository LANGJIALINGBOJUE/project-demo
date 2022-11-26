package com.langjialing.springbootmybatisdemo2.mapper;

import com.langjialing.springbootmybatisdemo2.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 郎家岭伯爵
 */
@Mapper
public interface UserMapper {
    /**
     * 获取所有用户信息。
     * @return
     */
    List<User> getAll();

    /**
     * 获取指定ID的用户信息。
     * @param id
     * @return
     */
    User getOne(Integer id);

    /**
     * 插入用户。
     * @param user
     */
    void insert(User user);

    /**
     * 更新指定ID的用户信息。
     * @param user
     */
    void update(User user);

    /**
     * 删除指定ID的用户信息。
     * @param id
     */
    void delete(Integer id);
}
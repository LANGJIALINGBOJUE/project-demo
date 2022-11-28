package com.langjialing.springbootspringdatajpademo.service;

import com.langjialing.springbootspringdatajpademo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author 郎家岭伯爵
 */
public interface UserService {
    /**
     * 根据id查找用户信息。
     * @param id 用户id
     * @return
     */
    User findById(Integer id);

    /**
     * 查找所有用户信息。
     * @return
     */
    List<User> findAll();

    /**
     * 插入用户信息。
     * @param user 用户信息
     * @return
     */
    User save(User user);

    User update(User user);

    /**
     * 根据id删除用户信息。
     * @param id 用户id
     */
    void delete(Integer id);

    /**
     * 拓展：分页功能。
     * @param pageable
     * @return
     */
    Page<User> findAll(Pageable pageable);

    /**
     * 拓展：定义一个根据 name 模糊查询的方法。
     * @param name
     * @return
     */
    List<User> findByNameLikeIgnoreCase(String name);
}
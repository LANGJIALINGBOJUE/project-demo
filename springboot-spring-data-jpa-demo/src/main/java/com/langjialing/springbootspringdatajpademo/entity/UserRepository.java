package com.langjialing.springbootspringdatajpademo.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 郎家岭伯爵
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    /**
     * 定义一个根据 name 模糊查询的方法。
     * @param name
     * @return
     */
    List<User> findByNameLikeIgnoreCase(String name);
}
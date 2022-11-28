package com.langjialing.springbootspringdatajpademo.service.impl;

import com.langjialing.springbootspringdatajpademo.entity.User;
import com.langjialing.springbootspringdatajpademo.entity.UserRepository;
import com.langjialing.springbootspringdatajpademo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @author 郎家岭伯爵
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    @Override
    public User findById(Integer id) {
        /* 由于 userRepository.getById(id) 方法已过时，因此也可使用如下这段代码来代替。
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()){
            User user1 = user.get();
            log.info("user为：{}", user1);
        }
         */
        return userRepository.getById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public List<User> findByNameLikeIgnoreCase(String name) {
        return userRepository.findByNameLikeIgnoreCase(name);
    }
}
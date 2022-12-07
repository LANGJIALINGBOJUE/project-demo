package top.codingmore.codingmoretransactional.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.codingmore.codingmoretransactional.entity.User;

import java.util.List;


/**
 * @author 郎家岭伯爵
 */
public interface UserService {
    User findById(Integer id);
    List<User> findAll();
    User save(User user);
    void delete(Integer id);

    Page<User> findAll(Pageable pageable);

    List<User> findByNameLike(String name);

    /**
     * 更新用户。
     * @param user
     */
    void update(User user) throws InterruptedException;

    /**
     * 更新用户
     * @param user
     */
    void updateTransaction(User user);
}

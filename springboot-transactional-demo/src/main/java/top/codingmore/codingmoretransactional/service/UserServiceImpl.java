package top.codingmore.codingmoretransactional.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import top.codingmore.codingmoretransactional.entity.User;
import top.codingmore.codingmoretransactional.repository.UserRepository;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * @author 郎家岭伯爵
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserRepository userRepository;

    @Resource
    private TransactionTemplate transactionTemplate;

    @Override
    public User findById(Integer id) {
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
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public List<User> findByNameLike(String name) {
//        return userRepository.findByNameLikeNativeQuery(name);
        return userRepository.findByNameLikeParam(name);
//        return userRepository.findByNameLike(name);
    }

    /**
     * 声明式事务使用
     * @param user
     */
    @Override
    @Transactional(rollbackFor= RuntimeException.class, timeout = 2)
    public void update(User user) throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        userRepository.save(user);
//        throw new RuntimeException("手动抛出异常！");
    }

    /**
     * 编程式事务使用，以 TransactionTemplate 用法为例。
     * @param user
     */
    @Override
    public void updateTransaction(User user){
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                try {
                    // ...  业务代码
                    userRepository.save(user);
                    throw new RuntimeException("手动抛出异常！");
                } catch (Exception e){
                    //回滚
                    transactionStatus.setRollbackOnly();
                }

            }
        });
    }
}

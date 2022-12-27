package com.langjialing.springbootredisdemo2.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *
 * 对象必须实现序列化，才能存储到Redis。如果没实现Serializable，控制台会报异常！
 *
 * @author 郎家岭伯爵
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private String email;

    private String userName;

    private String password;
}

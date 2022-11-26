package com.langjialing.springbootmybatisdemo2.pojo;

import lombok.Builder;
import lombok.Data;

/**
 * @author 郎家岭伯爵
 */
@Data
@Builder
public class User {
    private Integer id;
    private String name;
    private String password;
    private Integer age;
}

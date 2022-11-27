package com.langjialing.springbootmybatisplusdemo.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

/**
 * @author 郎家岭伯爵
 */
@Data
@Builder
@TableName("user")
public class User {
    @TableId(value = "id")
    private Integer id;
    private String name;
    private String password;
    private Integer age;
}
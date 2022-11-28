package com.langjialing.springbootspringdatajpademo.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 郎家岭伯爵
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {
    @Id
    private Integer id;
    private String name;
    private String password;
    private Integer age;
}
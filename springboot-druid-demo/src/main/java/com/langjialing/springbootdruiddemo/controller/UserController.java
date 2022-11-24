package com.langjialing.springbootdruiddemo.controller;

import com.langjialing.springbootdruiddemo.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 郎家岭伯爵
 */
@RestController
@Slf4j
public class UserController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/getUser")
    public List<User> getUser() throws SQLException {
        String sql ="select * from user ";
        log.info(sql);

        //获得连接
        Connection conn =  dataSource.getConnection();

        //PreparedStatement
        PreparedStatement pst = conn.prepareStatement(sql);

        List<User> result = new ArrayList<>();
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            User user = new User();
            user.setId(rs.getInt(1));
            user.setAge(rs.getInt("age"));
            user.setName(rs.getString("name"));
            user.setPassword(rs.getString("password"));
            result.add(user);
        }

        pst.close();
        conn.close();

        return result;
    }

}
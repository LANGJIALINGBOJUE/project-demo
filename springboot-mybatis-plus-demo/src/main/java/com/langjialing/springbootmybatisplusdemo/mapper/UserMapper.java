package com.langjialing.springbootmybatisplusdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.langjialing.springbootmybatisplusdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 郎家岭伯爵
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
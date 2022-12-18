package com.langjialing.springbootmybatisgeneratordemo.mapper;

import com.langjialing.springbootmybatisgeneratordemo.model.entity.UserTable;
import com.langjialing.springbootmybatisgeneratordemo.model.entity.UserTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTableMapper {
    long countByExample(UserTableExample example);

    int deleteByExample(UserTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserTable record);

    int insertSelective(UserTable record);

    List<UserTable> selectByExample(UserTableExample example);

    UserTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserTable record, @Param("example") UserTableExample example);

    int updateByExample(@Param("record") UserTable record, @Param("example") UserTableExample example);

    int updateByPrimaryKeySelective(UserTable record);

    int updateByPrimaryKey(UserTable record);
}
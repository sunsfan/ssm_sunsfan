package com.sunsfan.dao;

import com.sunsfan.entity.User;
import com.sunsfan.entity.UserDepartment;
import com.sunsfan.entity.UserDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDepartmentMapper {
    long countByExample(UserDepartmentExample example);

    int deleteByExample(UserDepartmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserDepartment record);

    int insertSelective(UserDepartment record);

    List<UserDepartment> selectByExample(UserDepartmentExample example);

    UserDepartment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserDepartment record, @Param("example") UserDepartmentExample example);

    int updateByExample(@Param("record") UserDepartment record, @Param("example") UserDepartmentExample example);

    int updateByPrimaryKeySelective(UserDepartment record);

    int updateByPrimaryKey(UserDepartment record);

    int insertBatchSelective(List<UserDepartment> records);

    int updateBatchByPrimaryKeySelective(List<UserDepartment> records);
}
package com.sunsfan.dao;

import com.sunsfan.entity.UserRelation;
import com.sunsfan.entity.UserRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRelationMapper {
    long countByExample(UserRelationExample example);

    int deleteByExample(UserRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserRelation record);

    int insertSelective(UserRelation record);

    List<UserRelation> selectByExample(UserRelationExample example);

    UserRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserRelation record, @Param("example") UserRelationExample example);

    int updateByExample(@Param("record") UserRelation record, @Param("example") UserRelationExample example);

    int updateByPrimaryKeySelective(UserRelation record);

    int updateByPrimaryKey(UserRelation record);

    int insertBatchSelective(List<UserRelation> records);

    int updateBatchByPrimaryKeySelective(List<UserRelation> records);
}
/**
 * Copyright (C), 2015-2019, meituan
 * FileName: UserRelationServiceImpl
 * Author:   sunteng
 * Date:     2019/3/6 下午4:11
 * Description: UserRelationService实现类
 * History:
 * <author>          <date>          <version>          <desc>
 * 作者姓名           创建时间           版本号              描述
 */
package com.sunsfan.service.impl;

import com.sunsfan.dao.UserRelationMapper;
import com.sunsfan.entity.UserRelation;
import com.sunsfan.entity.UserRelationExample;
import com.sunsfan.service.UserRelationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈UserRelationService实现类〉
 *
 * @author sunteng
 * @create 2019/3/6
 * @version 1.0.0
 */
@Service
public class UserRelationServiceImpl implements UserRelationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserRelationServiceImpl.class);

    private UserRelationMapper userRelationMapper;

    @Autowired
    public UserRelationServiceImpl(UserRelationMapper userRelationMapper) {
        this.userRelationMapper = userRelationMapper;
    }

    @Override
    public UserRelation selectUserRelationById(Long id) {
        UserRelationExample userRelationExample = new UserRelationExample();
        UserRelationExample.Criteria criteria = userRelationExample.createCriteria();
        criteria.andIdEqualTo(id).andIsdeleteEqualTo(Boolean.FALSE);

        List<UserRelation> userRelationList = userRelationMapper.selectByExample(userRelationExample);
        if (userRelationList.size() == 0){
            LOGGER.error("查询用户失败，原因：用户不存在，用户ID：{}", id);
            return null;
        }else{
            return userRelationList.get(0);
        }
    }

    @Override
    public List<UserRelation> selectAll() {
        UserRelationExample userRelationExample = new UserRelationExample();
        UserRelationExample.Criteria criteria = userRelationExample.createCriteria();
        criteria.andIsdeleteEqualTo(Boolean.FALSE);

        return userRelationMapper.selectByExample(userRelationExample);
    }

    @Override
    public int saveUserRelation(UserRelation userRelation) {
        return userRelationMapper.insertSelective(userRelation);
    }

    @Override
    public int updateUserRelation(UserRelation userRelation) {
        return userRelationMapper.updateByPrimaryKey(userRelation);
    }

    @Override
    public int deleteUserRelation(Long id) {
        // 逻辑删除
        UserRelation userRelation = selectUserRelationById(id);
        if (userRelation == null){
            LOGGER.error("删除用户部门关系失败，原因：无此用户部门关系，关系ID：{}", id);
            return 0;
        }else{
            userRelation.setIsdelete(Boolean.TRUE);
            return updateUserRelation(userRelation);
        }
    }
}

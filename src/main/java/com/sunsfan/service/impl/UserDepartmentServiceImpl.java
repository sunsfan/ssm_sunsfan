/**
 * Copyright (C), 2015-2019, meituan
 * FileName: UserDepartmentServiceImpl
 * Author:   sunteng
 * Date:     2019/3/5 下午3:51
 * Description: UserDepartmentService实现类
 * History:
 * <author>          <date>          <version>          <desc>
 * 作者姓名           创建时间           版本号              描述
 */
package com.sunsfan.service.impl;

import com.sunsfan.dao.UserDepartmentMapper;
import com.sunsfan.entity.User;
import com.sunsfan.entity.UserDepartment;
import com.sunsfan.entity.UserDepartmentExample;
import com.sunsfan.entity.UserExample;
import com.sunsfan.service.UserDepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈UserDepartmentService实现类〉
 *
 * @author sunteng
 * @create 2019/3/5
 * @version 1.0.0
 */
@Service
public class UserDepartmentServiceImpl implements UserDepartmentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    private UserDepartmentMapper userDepartmentMapper;

    @Autowired
    public UserDepartmentServiceImpl(UserDepartmentMapper userDepartmentMapper) {
        this.userDepartmentMapper = userDepartmentMapper;
    }

    @Override
    public UserDepartment selectUserDepartmentById(Long id) {
        UserDepartmentExample userDepartmentExample = new UserDepartmentExample();
        UserDepartmentExample.Criteria criteria = userDepartmentExample.createCriteria();
        criteria.andIdEqualTo(id).andIsdeleteEqualTo(Boolean.FALSE);

        List<UserDepartment> userDepartmentList = userDepartmentMapper.selectByExample(userDepartmentExample);
        if (userDepartmentList.size() == 0){
            LOGGER.error("查询部门失败，原因：部门不存在，用户ID：{}", id);
            return null;
        }else{
            return userDepartmentList.get(0);
        }
    }

    @Override
    public List<UserDepartment> selectAll() {
        UserDepartmentExample userDepartmentExample = new UserDepartmentExample();
        UserDepartmentExample.Criteria criteria = userDepartmentExample.createCriteria();
        criteria.andIsdeleteEqualTo(Boolean.FALSE);

        return userDepartmentMapper.selectByExample(userDepartmentExample);
    }

    @Override
    public int saveUserDepartment(UserDepartment userDepartment) {
        return userDepartmentMapper.insertSelective(userDepartment);
    }

    @Override
    public int updateUserDepartment(UserDepartment userDepartment) {
        return userDepartmentMapper.updateByPrimaryKey(userDepartment);
    }

    @Override
    public int deleteUserDepartment(Long id) {
        // 逻辑删除
        UserDepartment userDepartment = selectUserDepartmentById(id);
        if (userDepartment == null){
            LOGGER.error("删除部门失败，原因：无此部门，部门ID：{}", id);
            return 0;
        }else{
            userDepartment.setIsdelete(Boolean.TRUE);
            return updateUserDepartment(userDepartment);
        }
    }
}

/**
 * Copyright (C), 2015-2019, meituan
 * FileName: PersonServiceImpl
 * Author:   sunteng
 * Date:     2019/2/18 下午3:29
 * Description: Person服务接口实现类
 * History:
 * <author>          <date>          <version>          <desc>
 * 作者姓名           创建时间           版本号              描述
 */
package com.sunsfan.service.impl;

import com.sunsfan.dao.UserMapper;
import com.sunsfan.entity.User;
import com.sunsfan.entity.UserDepartment;
import com.sunsfan.entity.UserExample;
import com.sunsfan.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈User服务接口实现类〉
 *
 * @author sunteng
 * @create 2019/2/18
 * @version 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserById(Long id) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(id).andIsdeleteEqualTo(Boolean.FALSE);

        List<User> userList = userMapper.selectByExample(userExample);
        if (userList.size() == 0){
            LOGGER.error("查询用户失败，原因：用户不存在，用户ID：{}", id);
            return null;
        }else{
            return userList.get(0);
        }
    }

    @Override
    public List<User> selectAll() {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIsdeleteEqualTo(Boolean.FALSE);

        return userMapper.selectByExample(userExample);
    }

    @Override
    public int saveUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public int deleteUser(Long id) {
        // 逻辑删除
        User user = selectUserById(id);
        if (user == null){
            LOGGER.error("删除用户失败，原因：无此用户，用户ID：{}", id);
            return 0;
        }else{
            user.setIsdelete(Boolean.TRUE);
            return updateUser(user);
        }
    }

    @Override
    public UserDepartment selectUserDepartmentByUserId(Long id) {
        return null;
    }
}

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
import com.sunsfan.entity.UserExample;
import com.sunsfan.service.UserService;
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

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserById(Long id){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(id).andIsdeleteEqualTo(Boolean.FALSE);

        List<User> userList = userMapper.selectByExample(userExample);
        if (userList.size() == 0){
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
    public int insertUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int insertUserList(List<User> userList) {
        return userMapper.insertBatchSelective(userList);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public int updateUserList(List<User> userList) {
        return userMapper.updateBatchByPrimaryKeySelective(userList);
    }

    @Override
    public int deleteUser(Long id) {
        return 0;
    }

    @Override
    public int deleteUserByIdList(List<Long> idList) {
        return 0;
    }
}

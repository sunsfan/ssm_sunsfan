/**
 * Copyright (C), 2015-2019, meituan
 * FileName: UserService
 * Author:   sunteng
 * Date:     2019/2/18 下午3:25
 * Description: User服务接口
 * History:
 * <author>          <date>          <version>          <desc>
 * 作者姓名           创建时间           版本号              描述
 */
package com.sunsfan.service;

import com.sunsfan.entity.User;
import com.sunsfan.entity.UserDepartment;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈User服务接口〉
 *
 * @author sunteng
 * @create 2019/2/18
 * @version 1.0.0
 */
public interface UserService {

    /**
     * 根据id获取用户对象
     *
     * @param id
     * @return
     */
    User selectUserById(Long id);

    /**
     * 获取所有用户对象
     *
     * @param
     * @return
     */
    List<User> selectAll();

    /**
     * 新增用户对象
     *
     * @param user
     * @return
     */
    int saveUser(User user);

    /**
     * 修改用户对象
     *
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 根据id删除用户对象
     *
     * @param id
     * @return
     */
    int deleteUser(Long id);
}

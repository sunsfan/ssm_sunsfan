/**
 * Copyright (C), 2015-2019, meituan
 * FileName: UserDepartmentDepartmentService
 * Author:   sunteng
 * Date:     2019/2/19 下午2:51
 * Description: UserDepartmentDeparment服务接口
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
 * 〈UserDepartment服务接口〉
 *
 * @author sunteng
 * @create 2019/2/19
 * @version 1.0.0
 */
public interface UserDepartmentService {

    /**
     * 根据id获取部门对象
     *
     * @param id
     * @return
     */
    UserDepartment selectUserDepartmentById(Long id);

    /**
     * 获取所有部门对象
     *
     * @param
     * @return
     */
    List<UserDepartment> selectAll();

    /**
     * 根据部门id获取部门下所有员工对象
     *
     * @param id
     * @return
     */
    List<User> selectAllUserByDepartmentId(Long id);

    /**
     * 新增部门对象
     *
     * @param userDepartment
     * @return
     */
    int saveUserDepartment(UserDepartment userDepartment);

    /**
     * 修改部门对象
     *
     * @param userDepartment
     * @return
     */
    int updateUserDepartment(UserDepartment userDepartment);

    /**
     * 根据id逻辑删除部门对象
     *
     * @param id
     * @return
     */
    int deleteUserDepartment(Long id);
}

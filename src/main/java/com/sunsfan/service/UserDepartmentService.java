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
    
    UserDepartment selectUserDepartmentById(Long id);

    List<UserDepartment> selectAll();

    int insertUserDepartment(UserDepartment UserDepartment);

    int insertUserDepartmentList(List<UserDepartment> UserDepartmentList);

    int updateUserDepartment(UserDepartment UserDepartment);

    int updateUserDepartmentList(List<UserDepartment> UserDepartmentList);

    int deleteUserDepartment(Long id);

    int deleteUserDepartmentByIdList(List<Long> idList);
}

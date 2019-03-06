/**
 * Copyright (C), 2015-2019, meituan
 * FileName: UserRelationService
 * Author:   sunteng
 * Date:     2019/3/5 下午4:27
 * Description: UserRelationService接口
 * History:
 * <author>          <date>          <version>          <desc>
 * 作者姓名           创建时间           版本号              描述
 */
package com.sunsfan.service;

import com.sunsfan.entity.User;
import com.sunsfan.entity.UserRelation;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈UserRelationService接口〉
 *
 * @author sunteng
 * @create 2019/3/5
 * @version 1.0.0
 */
public interface UserRelationService {
    /**
     * 根据id获取用户对象
     *
     * @param id
     * @return
     */
    UserRelation selectUserRelationById(Long id);

    /**
     * 获取所有用户对象
     *
     * @param
     * @return
     */
    List<UserRelation> selectAll();

    /**
     * 新增用户对象
     *
     * @param userRelation
     * @return
     */
    int saveUserRelation(UserRelation userRelation);

    /**
     * 修改用户对象
     *
     * @param userRelation
     * @return
     */
    int updateUserRelation(UserRelation userRelation);

    /**
     * 根据id逻辑删除用户对象
     *
     * @param id
     * @return
     */
    int deleteUserRelation(Long id);
}

/**
 * Copyright (C), 2015-2019, meituan
 * FileName: UserController
 * Author:   sunteng
 * Date:     2019/2/19 下午4:29
 * Description: User控制类
 * History:
 * <author>          <date>          <version>          <desc>
 * 作者姓名           创建时间           版本号              描述
 */
package com.sunsfan.controller;

import com.sunsfan.entity.User;
import com.sunsfan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈User控制类〉
 *
 * @author sunteng
 * @create 2019/2/19
 * @version 1.0.0
 */
@Controller
@RequestMapping("/admin/users")
public class UserController {

    @Autowired
    UserService userService;

    // 查看用户列表
    @RequestMapping(method = RequestMethod.GET)
    public String getUsers(ModelMap modelMap){
        List<User> userList = userService.selectAll();

        modelMap.addAttribute("userList", userList);
        return "admin/users";
    }

    // 添加用户界面
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addUser(){
        return "admin/addUser";
    }

    // POST请求添加用户
    @RequestMapping(value = "/addUserPost", method = RequestMethod.POST)
    public String addUserPost(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/admin/users";
    }

    // 查看用户详情
    @RequestMapping(value = "/show/{id}", method = RequestMethod.GET)
    public String showUserDetail(@PathVariable("id") Long userId, ModelMap modelMap){
        User user = userService.selectUserById(userId);
        modelMap.addAttribute("user", user);
        return "admin/userDetail";
    }

    // 更新用户信息页面
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateUserInfo(@PathVariable("id") Long userId, ModelMap modelMap){
        User user = userService.selectUserById(userId);
        modelMap.addAttribute("user", user);
        return "/admin/updateUser";
    }

    // POST请求更新用户信息
    @RequestMapping(value = "/updateUserPost", method = RequestMethod.POST)
    public String updateUserPost(@ModelAttribute("user") User user){
        userService.updateUser(user);
        return "redirect:/admin/users";
    }

    // 逻辑删除用户
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("id") Long userId){
        User user = userService.selectUserById(userId);
        user.setIsdelete(Boolean.TRUE);
        userService.updateUser(user);
        return "redirect:/admin/users";
    }
}

/**
 * Copyright (C), 2015-2019, meituan
 * FileName: UserServiceTest
 * Author:   sunteng
 * Date:     2019/2/18 下午3:32
 * Description: User服务测试类
 * History:
 * <author>          <date>          <version>          <desc>
 * 作者姓名           创建时间           版本号              描述
 */
package com.sunsfan.test;

import com.sunsfan.common.SpringBaseWithCustomizeRunnerTest;
import com.sunsfan.entity.User;
import com.sunsfan.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈User服务测试类〉
 *
 * @author sunteng
 * @create 2019/2/18
 * @version 1.0.0
 */
public class UserServiceTest extends SpringBaseWithCustomizeRunnerTest {

    @Autowired
    private UserService userService;

    @Test
    public void testInsert(){
//        User user = new User("pogba", "m", 25, "manchester", Date.valueOf("1993-03-15"));
//        User user1 = new User("Arnold", "m", 21, "liverpool", Date.valueOf("1998-10-07"));
//        User user2 = new User("Fabinho", "m", 26, "liverpool", Date.valueOf("1993-10-23"));
//        User user3 = new User("van Dijk", "m", 28, "liverpool", Date.valueOf("1991-07-08"));
//        List<User> userList = new ArrayList<>();
//        UserList.add(user);
//        UserList.add(user1);
//        UserList.add(user2);
//        UserList.add(user3);
//        int rows = UserService.insertUserList(UserList);
        System.out.println();
    }

    @Test
    public void testSelect(){
        User user = userService.selectUserById(6L);
        System.out.println(user);
    }

    @Test
    public void testSelectALl(){
        List<User> userList = userService.selectAll();
        userList.forEach(System.out::println);
    }
//
//    @Test
//    public void testUpdate(){
//        User User = new User(1, "mane", "m", 26, "liverpool", Date.valueOf("1992-04-10"));
//        int rows = UserService.updateUser(User);
//        System.out.println(rows);
//    }
//
//    @Test
//    public void testDelete(){
//        ArrayList<Integer> idList = new ArrayList<>();
//        idList.add(1);
//        idList.add(2);
//        int rows = UserService.deleteUserByIdList(idList);
//        System.out.println(rows);
//
//    }
}

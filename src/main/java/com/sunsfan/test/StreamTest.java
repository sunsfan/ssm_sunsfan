/**
 * Copyright (C), 2015-2019, meituan
 * FileName: StreamTest
 * Author:   sunteng
 * Date:     2019/2/27 下午5:24
 * Description: 流特性测试类
 * History:
 * <author>          <date>          <version>          <desc>
 * 作者姓名           创建时间           版本号              描述
 */
package com.sunsfan.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈流特性测试类〉
 *
 * @author sunteng
 * @create 2019/2/27
 * @version 1.0.0
 */
public class StreamTest {

    public static void main(String[] args) {
        List<String> stringList = new LinkedList<>();
        stringList.add("aaaaaaaaa");
        stringList.add("aaaaaffaaaa");
        stringList.add("aaaaahhaaaa");
        stringList.add("aaaaaagggaaa");
        stringList.add("aaaajjjaaaaa");
        stringList.add("aaaaaafffffaaa");
        stringList.add("aakkkaaaaaa");
        stringList.add("aal;;aaaa");
        stringList.add("aalllaaaaaaa");
        stringList.add("aa;;;aaaaaaaerfhw");

        long count = stringList.stream().filter(w -> w.length() > 11).count();
        System.out.println(count);

    }
}

/**
 * Copyright (C), 2015-2019, meituan
 * FileName: MainController
 * Author:   sunteng
 * Date:     2019/2/26 上午10:48
 * Description: 主控制器
 * History:
 * <author>          <date>          <version>          <desc>
 * 作者姓名           创建时间           版本号              描述
 */
package com.sunsfan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 〈一句话功能简述〉<br> 
 * 〈主控制器〉
 *
 * @author sunteng
 * @create 2019/2/26
 * @version 1.0.0
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}

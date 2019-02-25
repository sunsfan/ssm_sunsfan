/**
 * Copyright (C), 2015-2019, meituan
 * FileName: CustomizeJunit4ClassRunner
 * Author:   sunteng
 * Date:     2019/2/18 下午3:35
 * Description: 定制化基础测试类
 * History:
 * <author>          <date>          <version>          <desc>
 * 作者姓名           创建时间           版本号              描述
 */
package com.sunsfan.common;
import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈定制化基础测试类〉
 *
 * @author sunteng
 * @create 2019/2/18
 * @version 1.0.0
 */
/**
 * Created by csophys on 14-10-25.
 */

public class CustomizeJunit4ClassRunner extends SpringJUnit4ClassRunner {

    static {
      /*  try {
            Log4jConfigurer.initLogging("classpath:log4j2.xml");
        } catch (Exception ex) {
            System.err.println("Cannot load log4j2,please check log4j2.xml file exist?");
        }*/
    }

    public CustomizeJunit4ClassRunner(Class<?> clazz) throws InitializationError {
        super(clazz);
    }
}

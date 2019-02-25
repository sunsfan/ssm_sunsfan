/**
 * Copyright (C), 2015-2019, meituan
 * FileName: SpringBaseWithCustomizeRunnerTest
 * Author:   sunteng
 * Date:     2019/2/18 下午3:33
 * Description: 基础测试类
 * History:
 * <author>          <date>          <version>          <desc>
 * 作者姓名           创建时间           版本号              描述
 */
package com.sunsfan.common;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈一句话功能简述〉<br>
 * 〈基础测试类〉
 *
 * @author sunteng
 * @create 2019/2/18
 * @version 1.0.0
 */

@RunWith(CustomizeJunit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath*:/config/spring/local/appcontext-*.xml"
})
@Transactional
@ActiveProfiles("test")
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionalTestExecutionListener.class
})
@TransactionConfiguration(defaultRollback = false)
@WebAppConfiguration
public class SpringBaseWithCustomizeRunnerTest {
    protected void start() {
        System.out.println("************************************************************************************************************************");
        printSpaceLine(3);
    }

    protected void end() {
        printSpaceLine(3);
        System.out.println("************************************************************************************************************************");
    }

    private void printSpaceLine(int line) {
        for (int i = 0; i < line; i++) {
            System.out.println("\n");
        }
    }
}
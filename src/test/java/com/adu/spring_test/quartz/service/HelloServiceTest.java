package com.adu.spring_test.quartz.service;

import com.adu.spring_test.quartz.service.HelloService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author yunjiedu
 * @email yunjiedu@sohu-inc.com
 * @date 2015/4/1 11:01
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/com/adu/spring_test/quartz/service/service.xml")
public class HelloServiceTest {
    @Autowired
    private HelloService helloService;
    private final Log logger = LogFactory.getLog(this.getClass());

    @Test
    public void work() {
        helloService.work();
        logger.info("end");
    }
}

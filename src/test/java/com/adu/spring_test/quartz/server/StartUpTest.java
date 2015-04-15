package com.adu.spring_test.quartz.server;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartUpTest {

    private Log logger = LogFactory.getLog(this.getClass());

    @Test
    public void test() {
        logger.debug("hello");
    }

    @Test
    public void main() {
        ApplicationContext context;
        logger.info("main start~");
        try {
            context = new ClassPathXmlApplicationContext(
                    "applicationContext.xml");

            while (true) {
                Thread.sleep(100000000);
            }

        } catch (Exception e) {
            logger.error("[ERROR-main]", e);
        }
        logger.debug("end");
    }

}

package com.adu.spring_test.quartz.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author yunjiedu
 * @email yunjiedu@sohu-inc.com
 * @date 2015/4/1 10:49
 */
public class HelloService {
	private final Log logger = LogFactory.getLog(this.getClass());

	public void work() {
		logger.debug("start...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			logger.error("[ERROR-work]", e);
		}
		logger.debug("end...");

	}
}

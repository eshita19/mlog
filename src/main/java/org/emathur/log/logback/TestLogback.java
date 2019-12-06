package org.emathur.log.logback;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class TestLogback {

	public static void main(String[] args) {
		Logger logger = (Logger) LoggerFactory.getILoggerFactory().getLogger(TestLogback.class.getName());
		System.out.println("hi");
		logger.trace("logback debug log {}", "param1");
		logger.info("info log");
		logger.debug("debug log");
		logger.error("Error log");
		logger.trace("Another trace log");
	}
}

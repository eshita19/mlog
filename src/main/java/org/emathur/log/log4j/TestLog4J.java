package org.emathur.log.log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class TestLog4J {
	public static void main(String[] args){
		Logger logger = Logger.getLogger(TestLog4J.class.getName());
		logger.error("This is debug log");
		logger.trace("This is trace log");
		logger.info("This is info log");
	}
}

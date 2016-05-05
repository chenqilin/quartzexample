package com.kylin.quartzjob;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class QuartzJobExample {
	public static Log log = LogFactory.getLog(QuartzJobExample.class);
	public void work(){
		System.out.println("work");
		 log.debug(System.currentTimeMillis()+":start");
	}
}

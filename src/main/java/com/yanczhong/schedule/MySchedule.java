package com.yanczhong.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.yanczhong.controller.BaseController;

@Component("MySchedule")
public class MySchedule extends BaseController{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6901843434764050545L;

	@Scheduled(fixedRate=60000)
	public void run() {
		logger.info("============= SpringBoot : MySchedule is running =============");
	}
}

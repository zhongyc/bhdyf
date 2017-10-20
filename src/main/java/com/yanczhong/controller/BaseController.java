package com.yanczhong.controller;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import com.yanczhong.Application;

@Controller
public class BaseController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6796077238431830139L;
	
	protected static Logger logger = Logger.getLogger(Application.class);

}

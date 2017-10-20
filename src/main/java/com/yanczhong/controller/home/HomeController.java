package com.yanczhong.controller.home;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yanczhong.controller.BaseController;

@Controller
public class HomeController extends BaseController{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7568599673726238715L;
	
	@RequestMapping(value="/")
	public String welcome(HttpServletRequest request) {
        return "redirect:index.html";
	}
	
	@RequestMapping(value="/index.html")
	public String index(HttpServletRequest request) {
        return "index";
	}
	
	@RequestMapping(value="/discovery.html")
	public String discovery(HttpServletRequest request) {
        return "discovery";
	}

}

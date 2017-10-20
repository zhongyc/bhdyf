package com.yanczhong;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;  

/**
 * servlet容器启动
 * <p>Title: ServletInitializer.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: 北海道渔夫</p>
 * @author 北海道渔夫
 * @date 2017年8月16日上午9:19:41
 * @version 1.0
 */
public class ServletInitializer extends SpringBootServletInitializer {  

    @Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
        return application.sources(Application.class);  
    }  

} 
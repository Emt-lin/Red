package com.example.gobang.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import java.util.ArrayList;
import java.util.List;


/**
 * @author psl
 * @date 2019/5/22
 */
@Configuration
public class SocketConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List<String> urls = new ArrayList<>();
        urls.add("/user/add.do");
        urls.add("/socket/join.do");
        urls.add("/socket/one.do");

        List<String> excludeUrls = new ArrayList<>();
        excludeUrls.add("/user/register.do");
        excludeUrls.add("/user//findAll.do");
        excludeUrls.add("/user//login.do");
//        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(urls).excludePathPatterns(excludeUrls);
    }

}

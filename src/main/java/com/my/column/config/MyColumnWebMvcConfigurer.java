/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2021 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package com.my.column.config;

import com.my.column.common.Constants;
import com.my.column.interceptor.MyColumnLoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.FileNotFoundException;

@Configuration
public class MyColumnWebMvcConfigurer implements WebMvcConfigurer {

    @Autowired
    private MyColumnLoginInterceptor myColumnLoginInterceptor;

    public void addInterceptors(InterceptorRegistry registry) {

        // 登陆拦截
        registry.addInterceptor(myColumnLoginInterceptor)
                .excludePathPatterns("/register")
                .excludePathPatterns("/login")
                .excludePathPatterns("/logout")
                .excludePathPatterns("/static/**")
                .addPathPatterns("/columnPage")
                .addPathPatterns("/updateColumnInfo")
                .addPathPatterns("/myColumnPage")
                .addPathPatterns("/columnDetail/**")
                .addPathPatterns("/uploadFile")
                .addPathPatterns("/uploadFiles")
                .addPathPatterns("/articleEdit")
                .addPathPatterns("/articleEdit/**")
                .addPathPatterns("/article/**")
                .addPathPatterns("/updateUserInfo")
                .addPathPatterns("/personal");
    }

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        //将login.html映射到路径urlpath为："/"上
//        registry.addViewController("/").setViewName("login");
//
////        WebMvcConfigurer.super.addViewControllers(registry);
//    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        try {
            registry.addResourceHandler("/static/upload/**").addResourceLocations("file:" + ResourceUtils.getURL("classpath:static").getPath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

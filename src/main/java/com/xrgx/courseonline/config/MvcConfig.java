package com.xrgx.courseonline.config;

import com.xrgx.courseonline.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //有重定向，所以添加视图映射
        registry.addViewController("/welcome.html").setViewName("welcome");
        registry.addViewController("/course.html").setViewName("course");
        registry.addViewController("/alter.html").setViewName("alter");
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //设置拦截器的拦截路径。有些请求不应该拦截，应排除
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/index.html", "/", "/student/login", "/goLogin");
    }

    //jquery
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}

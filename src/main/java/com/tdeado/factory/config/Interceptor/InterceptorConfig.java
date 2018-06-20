package com.tdeado.factory.config.Interceptor;

import com.tdeado.factory.interceptor.LoginTimeInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
    private InterceptorRegistration obj;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //这里可以添加多个拦截器  
//        obj = registry.addInterceptor(new LoginTimeInterceptor());
//        obj.addPathPatterns("/**");
//        obj.excludePathPatterns("/user/login");
//        obj.excludePathPatterns("/admin/**");
        super.addInterceptors(registry);
    }  
}  

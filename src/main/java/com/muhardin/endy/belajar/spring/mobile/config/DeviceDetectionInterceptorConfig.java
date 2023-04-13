package com.muhardin.endy.belajar.spring.mobile.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mobile.device.DeviceHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.muhardin.endy.belajar.spring.mobile.interceptor.CustomDeviceResolverHandlerInterceptor;

@Configuration
public class DeviceDetectionInterceptorConfig implements WebMvcConfigurer {
    
	@Bean
	public CustomDeviceResolverHandlerInterceptor deviceResolverHandlerInterceptor() {
		return new CustomDeviceResolverHandlerInterceptor();
	}

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(deviceResolverHandlerInterceptor());
    }

    @Bean
    public DeviceHandlerMethodArgumentResolver deviceHandlerMethodArgumentResolver() {
        return new DeviceHandlerMethodArgumentResolver();
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(deviceHandlerMethodArgumentResolver());
    }
}

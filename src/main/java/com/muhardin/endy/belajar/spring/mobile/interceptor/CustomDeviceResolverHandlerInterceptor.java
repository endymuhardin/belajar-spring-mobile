package com.muhardin.endy.belajar.spring.mobile.interceptor;

import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.DeviceResolver;
import org.springframework.mobile.device.DeviceUtils;
import org.springframework.mobile.device.LiteDeviceResolver;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CustomDeviceResolverHandlerInterceptor implements HandlerInterceptor {
    private final CustomDeviceResolver deviceResolver;


	public CustomDeviceResolverHandlerInterceptor() {
		this(new CustomLiteDeviceResolver());
	}

	public CustomDeviceResolverHandlerInterceptor(CustomDeviceResolver deviceResolver) {
		this.deviceResolver = deviceResolver;
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		Device device = deviceResolver.resolveDevice(request);
		request.setAttribute(DeviceUtils.CURRENT_DEVICE_ATTRIBUTE, device);
		return true;
	}

}

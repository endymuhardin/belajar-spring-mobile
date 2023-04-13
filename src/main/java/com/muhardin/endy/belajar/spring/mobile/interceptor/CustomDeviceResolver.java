package com.muhardin.endy.belajar.spring.mobile.interceptor;

import org.springframework.mobile.device.Device;

import jakarta.servlet.http.HttpServletRequest;

public interface CustomDeviceResolver {
    default Device resolveDevice(HttpServletRequest request) {
		return null;
	}
}

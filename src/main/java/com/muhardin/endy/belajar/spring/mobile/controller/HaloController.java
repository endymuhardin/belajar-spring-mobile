package com.muhardin.endy.belajar.spring.mobile.controller;

import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HaloController {
    @GetMapping("/")
    public String halo(ModelMap modelMap, Device device){
        modelMap.addAttribute("deviceName", device.toString());
        return "halo";
    }
}

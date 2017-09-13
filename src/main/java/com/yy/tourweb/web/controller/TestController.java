package com.yy.tourweb.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yy.tourweb.web.service.IBaseService;

@Controller
public class TestController {
    
    @Resource
    private IBaseService baseService;
    
    @RequestMapping("test")
    public String test(HttpServletRequest request, HttpServletResponse response, Model model) {
        return "hello";
    }
    
}

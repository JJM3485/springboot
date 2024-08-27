package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hi {
    @GetMapping("/hi")
    @ResponseBody
    public String hello() {
        return "이것은 hi를 입력했을 시 나오는 문구입니다.";
    }
}
package com.example.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


@Controller
public class BasicController {
    @GetMapping("/")
    @ResponseBody
    String hello() {
        return "안녕하세요";
    }

    @GetMapping("html")
    @ResponseBody
    public String html(){
        return "반갑습니다";
    }

    @GetMapping("/about")
    @ResponseBody
    public String about() {
        return "피싱사이트에요";
    }
    @GetMapping("/html1")
    public String html1() {
        return "index.html";
    }
    @GetMapping("/date")
    @ResponseBody
    public String date() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-ddEHH:mm:ss.SSSSSSSSS", Locale.ENGLISH);
        return now.format(formatter);
    }
}


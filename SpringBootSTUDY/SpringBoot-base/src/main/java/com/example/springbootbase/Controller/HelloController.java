package com.example.springbootbase.Controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:  张三
 * date: 2025/2/8
 * desc:
 * version:
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String Hello(){
        return "Hello World!";
    }



}

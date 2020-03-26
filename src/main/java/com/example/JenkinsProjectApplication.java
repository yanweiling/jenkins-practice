package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsProjectApplication.class, args);
    }

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "你好";
    }

}

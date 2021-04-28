package com.example.Walkocity.accessingdatamysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WalkocityApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WalkocityApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value ="name", defaultValue="World") String name) {
        return String.format("Let's take a walk, %s!", name);
    }

    //HEJ! IGEN !! !!!

}

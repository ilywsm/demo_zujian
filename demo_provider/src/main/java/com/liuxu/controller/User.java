package com.liuxu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/provider")
public class User {
    @RequestMapping("/users")
    public List<String> showUsers(){
        return Arrays.asList("张安","李四","王五");
    }
}

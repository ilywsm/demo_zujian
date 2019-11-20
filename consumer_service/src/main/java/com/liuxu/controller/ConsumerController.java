package com.liuxu.controller;

import com.liuxu.client.ProviderFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private ProviderFeignService providerFeignService;


    @RequestMapping("/user/list")
    public List<String>  showUsers(){

        //return Arrays.asList("张安","李四","王五");
        return providerFeignService.selectAllUsers();
    }
}

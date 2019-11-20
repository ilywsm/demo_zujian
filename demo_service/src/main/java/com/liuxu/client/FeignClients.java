package com.liuxu.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@FeignClient(name = "provider-server")
@RequestMapping("/provider")
public interface FeignClients {
    @RequestMapping("/users")
    public List<String> showUsers();
}

package com.liuxu.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "provider-service")
public interface ProviderFeignService {

    @RequestMapping("/provider/users")
    public List<String> selectAllUsers();
}

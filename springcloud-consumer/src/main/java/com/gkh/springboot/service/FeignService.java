package com.gkh.springboot.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service")
public interface FeignService {

    @RequestMapping(value = "/hello/name")
    String hello(@RequestParam(value = "name") String name);
}

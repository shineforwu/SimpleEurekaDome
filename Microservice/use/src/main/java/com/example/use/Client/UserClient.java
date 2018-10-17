package com.example.use.Client;
import org.springframework.cloud.netflix.feign.FeignClient;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;



@FeignClient("provider")
public interface  UserClient {
    // @RequestMapping(method = RequestMethod.GET, value = "/add")
    // Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value =
    // "b") Integer b);


    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String test();
}

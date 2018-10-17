package com.example.use.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
import com.example.use.Client.*;


@RestController
public class UseController {
    @Autowired
    private UserClient userClient;
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String test() {
        return userClient.test();
    }
}


package com.example.unit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class DBAuthController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String test()
            throws Exception {
        System.out.println("visit test");
        return "junit test.";
    }
}

package com.example.unit.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DBAuthControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getName() {
        String name = restTemplate.getForObject("/api/test", String.class);
        System.out.println(name);
        Assert.assertEquals("junit test", name);
    }
}
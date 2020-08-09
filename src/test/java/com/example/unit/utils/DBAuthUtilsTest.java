package com.example.unit.utils;

import org.junit.Assert;
import org.junit.Test;

public class DBAuthUtilsTest {

    @Test
    public void addTest() {
        int result = DBAuthUtils.add(1, 10);
        Assert.assertEquals(result, 10);
    }
}
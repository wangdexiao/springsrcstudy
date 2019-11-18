package com.springsrc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBeanB {

    @Autowired
    private TestBeanA testBeanA;

    public static final String name = "testB";

    public TestBeanA getTestBeanA() {
        return testBeanA;
    }

    public void setTestBeanA(TestBeanA testBeanA) {
        this.testBeanA = testBeanA;
    }

    public static String getName() {
        return name;
    }
}

package com.springsrc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBeanA {

    private final String name = "com/springsrc";

    @Autowired
    private TestBeanB testBeanB;


    public TestBeanB getTestBeanB() {
        return testBeanB;
    }

    public void setTestBeanB(TestBeanB testBeanB) {
        this.testBeanB = testBeanB;
    }

    public String getName() {
        return name;
    }
}

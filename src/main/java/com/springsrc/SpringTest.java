package com.springsrc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.springsrc.bean.TestBeanA;

public class SpringTest {

//    public static final Log log = LogFactory.getLog(SpringTest.class);

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springsrc.bean");
        TestBeanA bean = context.getBean(TestBeanA.class);
        System.out.println(bean.getName());

    }
}

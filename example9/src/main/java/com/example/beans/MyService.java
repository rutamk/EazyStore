package com.example.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON) //optional
@Lazy
//@Scope("singleton")
public class MyService {
    public MyService() {
        System.out.println("MyService created");
    }
}

package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog implements Pet {
//    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }
    @Override
    public void say() {
        System.out.println("Bow bow");
    }

//    @PostConstruct
//    protected void init() {
//        System.out.println("Class dog: init method");
//
//    }
//
//    @PreDestroy
//    private void destroy() {
//        System.out.println("Class dog: destroy method");
//    }
}

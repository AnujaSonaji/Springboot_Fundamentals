package com.springboot.fundamentals.module1Intro;

import org.springframework.stereotype.Component;

// Spring knows this class exists
// Spring creates and manages object automatically
@Component
public class PaymentService{

    public void pay(){
        System.out.println("Bean Creation");
        System.out.println("Paying....");
    }
}

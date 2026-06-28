package com.springboot.fundamentals.module1Intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1IntroApplication implements CommandLineRunner {

	//@Autowired
	//PaymentService paymentService; //field injection - just autowire, no new keyword!

	private final PaymentService paymentService;

	// Spring sees ONE constructor — auto injects without even @Autowired!
	public Module1IntroApplication(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Module1IntroApplication.class, args);
	}

	@Override
	public void run(String[] args) throws Exception {
		paymentService.pay();
	}
}

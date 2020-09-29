package com.crystalug.HelloWorld;

import controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"controller"})
public class HelloWorldApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(HelloWorldApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = null;
		greeting = myController.sayHello();
		System.out.println(greeting);
	}

}

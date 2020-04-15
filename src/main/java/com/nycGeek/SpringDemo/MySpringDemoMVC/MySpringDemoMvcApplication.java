package com.nycGeek.SpringDemo.MySpringDemoMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class MySpringDemoMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringDemoMvcApplication.class, args);
	}

}

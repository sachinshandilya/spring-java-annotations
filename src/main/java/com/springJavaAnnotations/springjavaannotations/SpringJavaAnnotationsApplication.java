package com.springJavaAnnotations.springjavaannotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringJavaAnnotationsApplication {

	public static void main(String[] args) {
		System.out.println("demo app to use java annotations with xml file to use IoC and DI");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); //starting spring container
	    Coach theCoach = context.getBean("thatSillyCoach" , Coach.class); // (id of bean , of class BaseBallCoach)
	    String routine1 = theCoach.getRoutine();
	    System.out.println(routine1);
	    String service1 = theCoach.getService();
	    System.out.println(service1);
	    context.close();
		SpringApplication.run(SpringJavaAnnotationsApplication.class, args);
	}

}

package com.springJavaAnnotations.springjavaannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Component annotation creates bean for this class automatically which is stored in Object factory or say Spring Container
@Component("thatSillyCoach")
@Scope("singleton")
public class BasballCoach implements Coach {
   
	//always use Field Injection
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService theFortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	//will use constructor DI injection for it
	private FortuneService secondFortuneService;
	
	//will use setter injection for it
	private FortuneService thirdFortuneService;
	
	//gets called automatically when BaseballCoach class bean is created
	@Autowired
	 public BasballCoach(@Qualifier("luckyFortuneService") FortuneService fortuneService) {
		// TODO Auto-generated constructor stub
		secondFortuneService = fortuneService;
	}
	 
	 
	 //since added @Autowired on it this method will be invoked automatically when bean of class BasballCoach is craeted
	 @Autowired
	 public void setThirdFortuneService(FortuneService fortuneService) {
		 thirdFortuneService = fortuneService;
	 }
	
	@Override
	public String getRoutine() {
		// TODO Auto-generated method stub
		return "Do 5 hrs workout";
	}

	@Override
	public String getService() {
		// TODO Auto-generated method stub
		return theFortuneService.getService("John ") + secondFortuneService.getService("Janny ") + thirdFortuneService.getService("Janardhan");
	}
	
	@PostConstruct
	public void doSomeStartUpStuff() {
		System.out.println(this.email);
		System.out.println("these methods can be private , public or protected");
		
	}
	
    //In prototype scoped beans this is not called , we use DisposableBean setup for that , not going in its detail for now
	@PreDestroy
	public void doSomeCleanUpStuff() {
		
		System.out.println("these methods dont return anything");
		
	}
	
	
	
}














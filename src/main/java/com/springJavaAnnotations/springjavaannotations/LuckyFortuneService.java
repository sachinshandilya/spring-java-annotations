package com.springJavaAnnotations.springjavaannotations;

import org.springframework.stereotype.Component;

//if we don't specify bean name , bean id will be luckyFortuneSevice
@Component
public class LuckyFortuneService implements FortuneService {
	
	@Override
	public String getService(String name) {
		return "Hi from LuckyFortuneService " + name ; 
	}

}

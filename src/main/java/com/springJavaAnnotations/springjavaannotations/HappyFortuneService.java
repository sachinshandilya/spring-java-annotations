package com.springJavaAnnotations.springjavaannotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//important to give this annotation if we want to create its bean or want to use its bean in DI
@Component
//by-default  its bean will be auto-wired since it is primary
@Primary
public class HappyFortuneService implements FortuneService {

	@Override
	public String getService(String name) {
		// TODO Auto-generated method stub
		return name;
	}

}

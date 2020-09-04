package com.springJavaAnnotations.springjavaannotations;

public class TennisCoach implements Coach {

	@Override
	public String getRoutine() {
		// TODO Auto-generated method stub
		return "10 hrs workout with tennis coach";
	}

	@Override
	public String getService() {
		// TODO Auto-generated method stub
		return "servicing of tennis court required";
	}

}

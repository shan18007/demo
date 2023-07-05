package com.luv2code.aopdemo.services;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class FortuneService {

	public String getFortune() {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Today is heave traffic..";
	}
	
	public String getFortune(boolean flag) {
		
		if(flag) {
			throw new RuntimeException("Major accident.! Highway blocked");
		}
		return getFortune();
	}

}

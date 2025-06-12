package com.example.demo.service;

import java.time.LocalTime;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GreetingsServiceImpl implements IGreetingsService {
@Autowired
	private LocalTime time;
	
	@Override
	public String generateGreetings(String name) {
		// TODO Auto-generated method stub
		 
			int hour=time.getHour();
			
			if(hour<12)
				return "Good mng"+name;
			else if(hour<16)
				return "Good afn"+name;
			else if(hour<20)
				return "Good evg"+name;
			else
				return "good Ngt";
			
	}

}

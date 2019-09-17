package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Alien {
	private int aid;
	private String aname;
	private String atech;
	@Autowired
//	@Qualifier("AlienGadget")
	private Laptop laptop;
	
	public Alien() {
	}

	public void show() {
		System.out.println("Inside Show...");
		laptop.compile();
	}
}

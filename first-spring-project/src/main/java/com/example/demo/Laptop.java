package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.Data;

@Data
//@Component("AlienGadget")
@Service
public class Laptop {
	private int lid;
	private String brand;
	
	public void compile () {
		System.out.println("Alien Compiling Laptop....");
	}
}

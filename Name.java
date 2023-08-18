package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class Name {
@GetMapping("day12")
public String name()
{ 
	String a = "kaish";
	return"Welcome "+a;
}
}

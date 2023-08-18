package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class Colour {
@GetMapping("day13")
public String colour()

{
	String a="BLACK";
	return"My favourite colour is "+a;
}
}

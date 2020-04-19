package com.example.song.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("private")
public class PrivateController {

	@GetMapping("/get")
	public String getSong() {
		return "Hello Song";
	}
	
}

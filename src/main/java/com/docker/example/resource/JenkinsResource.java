package com.docker.example.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsResource {
	
	@GetMapping("/genkinstodocker")
	public String showGenkinsMessage() {
		return "welcome to jenkins to docker integration..";
	}

}

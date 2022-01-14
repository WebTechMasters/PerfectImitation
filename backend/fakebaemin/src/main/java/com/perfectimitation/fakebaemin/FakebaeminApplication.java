package com.perfectimitation.fakebaemin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FakebaeminApplication {

	public static void main(String[] args) {
		SpringApplication.run(FakebaeminApplication.class, args);
	}
	@GetMapping(path = "/")
	@ResponseBody
	public String home() {
		return "Hello World";
	}

}

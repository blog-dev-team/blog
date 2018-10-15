package com.blog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teste {

	@GetMapping("teste")
	public String get() {
		return "funciona mesmo Eh!";
	}
}

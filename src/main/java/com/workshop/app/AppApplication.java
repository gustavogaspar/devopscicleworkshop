package com.workshop.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class AppApplication {

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		String mensagem = "Ola Mundo";
		String m = mensagem.substring(0);
		return m;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}

package com.dockertest.demo;

import java.io.File;
import java.io.FileOutputStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSpringbootTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringbootTest1Application.class, args);
	}
	

	@RequestMapping("/test/{info}")
	public String test(@PathVariable(value="info") String info) throws Exception {
		FileOutputStream fos = new FileOutputStream(new File("/usr/test/test.txt"));
		fos.write(info.getBytes());
		fos.close();
		return "test ok!!";
	}
}


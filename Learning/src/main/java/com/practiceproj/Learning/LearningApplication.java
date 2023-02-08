package com.practiceproj.Learning;



import com.practiceproj.Learning.convert.ProtobufUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import java.io.IOException;

@SpringBootApplication
public class LearningApplication {
	public static ConfigurableApplicationContext context;
	public static void main(String[] args) throws IOException {
		SpringApplication.run(LearningApplication.class,args);
		System.out.println(ProtobufUtil.fromJson(APIUtil.callCodatAPI().getBody()));
	}

}


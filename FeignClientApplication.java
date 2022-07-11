package com.microservices.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@RestController
public class FeignClientApplication 
{
	@Autowired
	FeignUserClient feignClient;
	
	@GetMapping("/getdata")
	public List<Model> getData()
	{
		return feignClient.getCovidData();
	}
	public static void main(String[] args) {
		SpringApplication.run(FeignClientApplication.class, args);
	}

}

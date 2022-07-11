package com.microservices.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url="https://coronavirus-19-api.herokuapp.com",name="Feign")
public interface FeignUserClient 
{
	@GetMapping("/countries")
	public List<Model> getCovidData();
	
	
}

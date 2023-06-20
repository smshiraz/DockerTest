package com.docker.test;

import java.util.Map;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/")
	public Map<String,String> getValues()
	{
		Map<String,String> data = new HashMap<>();
		data.put("name", "Syed");
		data.put("addresss", "ghy");
		return data;
	}
}
	


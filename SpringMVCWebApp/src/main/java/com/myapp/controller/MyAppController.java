package com.myapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.dto.TestDTO;

@RestController
//@Controller
public class MyAppController {

	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
	
	
	@RequestMapping("/welcome")
	public String helloWorld(@RequestParam(value="name",defaultValue="himanshu") String name){
		return "himans :::"+name;
	}
	
	@RequestMapping(value="/welcome1", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	public TestDTO helloWorld1(@RequestParam(value="name",defaultValue="himanshu") String name){
		return new TestDTO(1, "himanshu");
	}
	
	@RequestMapping(value="/welcome11", produces=MediaType.APPLICATION_XML_VALUE, method=RequestMethod.GET)
	public TestDTO helloWorld11(@RequestParam(value="name",defaultValue="himanshu") String name){
		return new TestDTO(1, "himanshu");
	}
		
	
	@RequestMapping(value="/welcome4",method = RequestMethod.GET)
	public List<TestDTO> helloWorld4(){
		List<TestDTO> list= new ArrayList<TestDTO>();
		list.add(new TestDTO(1, "himanshu"));
		list.add(new TestDTO(2, "himanshu11"));
		return list;
	}
}

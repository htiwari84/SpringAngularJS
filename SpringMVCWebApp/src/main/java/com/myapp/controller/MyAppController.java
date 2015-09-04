package com.myapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.dao.TestDao;
import com.myapp.dto.TestDTO;

@RestController
// @Controller
public class MyAppController {

	@Autowired
	public TestDao testdao;

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String helloWorld() {
		TestDTO dto = new TestDTO();
		dto.setContent("himanshu");
		testdao.saveObject(dto);
		return "done";
	}

	@RequestMapping(value = "/welcome1", method = RequestMethod.GET)
	public ResponseEntity<TestDTO> helloWorld1() {
		return new ResponseEntity<TestDTO>(new TestDTO(1, "himanshu"), HttpStatus.OK);

	}

	@RequestMapping(value = "/welcome4", method = RequestMethod.GET)
	public List<TestDTO> helloWorld4() {
		List<TestDTO> list = new ArrayList<TestDTO>();
		list.add(new TestDTO(1, "himanshu"));
		list.add(new TestDTO(2, "himanshu11"));
		return list;
	}
}

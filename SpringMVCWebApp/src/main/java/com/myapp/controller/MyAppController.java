package com.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.dao.TestDao;
import com.myapp.dto.TestDTO;

@RestController
// @Controller
public class MyAppController {

	@Autowired
	public TestDao testdao;

	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public String save(@RequestParam(value="name", defaultValue="test") String name) {
		TestDTO dto = new TestDTO();
		dto.setContent(name);
		testdao.saveObject(dto);
		return "done";
	}

	/*@RequestMapping(value = "/welcome1", method = RequestMethod.GET)
	public ResponseEntity<TestDTO> helloWorld1() {
		return new ResponseEntity<TestDTO>(new TestDTO(1, "himanshu"), HttpStatus.OK);

	}
*/
	@RequestMapping(value = "/getAllRecord", method = RequestMethod.GET)
	public List<TestDTO> getAllRecord() {
		return testdao.getAllList();
	}
	
	
	@RequestMapping(value = "/getRecordById", method = RequestMethod.GET)
	public TestDTO getRecordById(@RequestParam(value="id", defaultValue="1") long id) {
		return testdao.getRecordById(id);
	}
	
}

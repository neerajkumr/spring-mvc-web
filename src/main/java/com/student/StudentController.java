package com.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

@Controller
public class StudentController {

	@Autowired
	public StudentService service;

	@GetMapping(path = "/", produces = "application/json")
	@ResponseBody
	public String getData() {
		return (new Gson().toJson(service.insert()));
	}

	@GetMapping(path = "/byID", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String update() {
		return (new Gson().toJson(service.updateID()));

	}

	@DeleteMapping(path = "/del/{name}", produces = "application/json")
	@ResponseBody
	public String delete(@PathVariable String name) {
		return (new Gson().toJson(service.deleteByName(name)));
	}

}

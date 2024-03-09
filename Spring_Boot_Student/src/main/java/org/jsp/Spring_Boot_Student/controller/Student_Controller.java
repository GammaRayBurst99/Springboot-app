package org.jsp.Spring_Boot_Student.controller;

//import java.util.Optional;

import org.jsp.Spring_Boot_Student.dao.Student_Dao;
import org.jsp.Spring_Boot_Student.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student_Controller {
	@Autowired
	private Student_Dao dao;
	
	@PostMapping("/savestudent")
	public void saveStudent(@RequestBody Student student) {
		dao.saveStudent(student);
	}
//	@GetMapping("/student/id")
//	public Optional<Student> find(@RequestParam  int id){
//		return dao.find(id);
//	}
	@GetMapping("/student/id")
	public Student find1(@RequestParam int id) {
		return dao.findBy(id);
	}

}

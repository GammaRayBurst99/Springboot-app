package org.jsp.Spring_Boot_Student.dao;

import org.jsp.Spring_Boot_Student.dto.Student;
import org.jsp.Spring_Boot_Student.repository.Student_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Student_Dao {
	@Autowired
	private Student_Repository repository;
	
	public void saveStudent(Student student) {
		repository.save(student);
	}
//	public Optional<Student> find(int id){
//		return repository.findById(id);
//	}
//	
    public Student findBy(int id) {
    	return repository.findById(id);
    }
}

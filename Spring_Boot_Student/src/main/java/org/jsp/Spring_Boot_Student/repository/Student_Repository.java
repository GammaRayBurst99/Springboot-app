package org.jsp.Spring_Boot_Student.repository;

import org.jsp.Spring_Boot_Student.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Student_Repository extends JpaRepository<Student, Integer> {
	public Student findById(int id);

}

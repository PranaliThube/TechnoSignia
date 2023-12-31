package com.student.service;

import java.util.List;

import com.student.entities.Student;

public interface StudentService {

	Student saveStudent(Student student);

	List<Student> fetchStudentList();

	Student updateStudent(Student student, Long studentId);

	void deleteStudentById(Long studentId);

}

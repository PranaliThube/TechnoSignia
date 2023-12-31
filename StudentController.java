package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entities.Student;
import com.student.service.StudentService;

import java.util.List;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	// save operation
	@PostMapping("/students")
	public Student saveStudents(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	// Read operation
	@GetMapping("/get/students")
	public List<Student> fetchStudent() {
		return studentService.fetchStudentList();
	}

	// Update operation
	@PutMapping("/students/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable("id") Long studentId) {
		return studentService.updateStudent(student, studentId);
	}

	// Delete operation
	@DeleteMapping("/students/{id}")

	public String deleteDepartmentById(@PathVariable("id") Long studentId) {
		studentService.deleteStudentById(studentId);
		return "Deleted Successfully";
	}
}

package com.student.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entities.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepo;

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public List<Student> fetchStudentList() {
		return (List<Student>) studentRepo.findAll();
	}

	@Override
	public Student updateStudent(Student student, Long studentId) {
		Student studentDB = studentRepo.findById(studentId).get();

		if (Objects.nonNull(student.getCollegeName()) && !"".equalsIgnoreCase(student.getCollegeName())) {
			studentDB.setCollegeName(student.getCollegeName());
		}

		if (Objects.nonNull(student.getCurrentAddress()) && !"".equalsIgnoreCase(student.getCurrentAddress())) {
			studentDB.setCurrentAddress(student.getCurrentAddress());
		}

		if (Objects.nonNull(student.getEducation()) && !"".equalsIgnoreCase(student.getEducation())) {
			studentDB.setEducation(student.getEducation());
		}

		if (Objects.nonNull(student.getEmail()) && !"".equalsIgnoreCase(student.getEmail())) {
			studentDB.setEmail(student.getEmail());
		}

		if (Objects.nonNull(student.getFirstName()) && !"".equalsIgnoreCase(student.getFirstName())) {
			studentDB.setFirstName(student.getFirstName());
		}

		if (Objects.nonNull(student.getLastName()) && !"".equalsIgnoreCase(student.getLastName())) {
			studentDB.setLastName(student.getLastName());
		}

		if (Objects.nonNull(student.getParentContact())) {
			studentDB.setParentContact(student.getParentContact());
		}

		if (Objects.nonNull(student.getStudenContact())) {
			studentDB.setStudenContact(student.getStudenContact());
		}

		if (Objects.nonNull(student.getPermanentAddress()) && !"".equalsIgnoreCase(student.getPermanentAddress())) {
			studentDB.setPermanentAddress(student.getPermanentAddress());
		}

		if (Objects.nonNull(student.getStudentID()) && !"".equalsIgnoreCase(student.getStudentID())) {
			studentDB.setStudentID(student.getStudentID());
		}

		return studentRepo.save(studentDB);
	}

	@Override
	public void deleteStudentById(Long studentId) {

		studentRepo.deleteById(studentId);

	}

}

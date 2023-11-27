package com.react.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.react.modal.Student;
import com.react.repository.StudentRepository;

@Service
public class StudentServiceimpl implements StudentService {
	
	   @Autowired
	    private StudentRepository studentRepository;

	    @Override
	    public Student saveStudent(Student student) {
	        return studentRepository.save(student);
	    }

	    @Override
	    public List<Student> getAllStudents() {
	        return studentRepository.findAll();
	    }

}

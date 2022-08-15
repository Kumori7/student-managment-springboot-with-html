package com.ab.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.Entities.Student;
import com.ab.Reposistories.StudentReposistory;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentReposistory reposistory;

	@Override
	public List<Student> displayAllStudents() {

		List<Student> studentList = reposistory.findAll();

		return studentList;

	}

	@Override
	public Student createStudent(Student student) {

		// List<Student> studentList = reposistory.findAll();

//		for (int i = 0; i < studentList.size(); i++) {
//
//			if (studentList.size() == 1) {
//				studentList.get(i).setId(1);
//			}
//		}
//		

		return reposistory.save(student);
	}

	@Override
	public void DeleteStudentById(int id) {

		this.reposistory.deleteById(id);
	}

	@Override
	public Student getStudentById(int id) {

		Student student = reposistory.findById(id).orElse(null);

		return student;
	}

} // end of class

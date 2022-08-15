package com.ab.Services;

import java.util.List;

import com.ab.Entities.Student;

public interface StudentService {

	public List<Student> displayAllStudents();

	public Student createStudent(Student student);

	public void DeleteStudentById(int id);

	public Student getStudentById(int id);

}

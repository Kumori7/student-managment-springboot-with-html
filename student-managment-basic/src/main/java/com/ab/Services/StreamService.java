package com.ab.Services;

import java.util.List;

import com.ab.Entities.Student;

public interface StreamService {

	public List<Student> sortByName();

	public List<Student> sortByAge();

	public List<Student> sortBySubject();

	public List<Student> sortByGenderAndAge();

	public List<Student> sortBySubjectAndAge();

}

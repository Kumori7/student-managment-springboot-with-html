package com.ab.Services;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.Entities.Student;
import com.ab.Reposistories.StreamReposistory;
import com.ab.Reposistories.StudentReposistory;

import net.bytebuddy.asm.Advice.This;

@Service
public class StreamServiceImpl implements StreamService {

	@Autowired
	private StudentReposistory reposistory;

	// breaks the program
	// private List<Student> studentList = reposistory.findAll();

	@Override
	public List<Student> sortByName() {

		List<Student> studentList = reposistory.findAll();

		List<Student> sortedList = studentList.stream().sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());

		return sortedList;
	}

	@Override
	public List<Student> sortByAge() {

		List<Student> studentList = reposistory.findAll();

		List<Student> sortedList = studentList.stream().sorted(Comparator.comparing(Student::getAge))
				.collect(Collectors.toList());

		return sortedList;
	}

	@Override
	public List<Student> sortBySubject() {

		List<Student> studentList = reposistory.findAll();

		List<Student> sortedList = studentList.stream().sorted(Comparator.comparing(Student::getSubject))
				.collect(Collectors.toList());

		return sortedList;
	}

	@Override
	public List<Student> sortByGenderAndAge() {

		List<Student> studentList = reposistory.findAll();

		List<Student> sortedList = studentList.stream()
				.sorted(Comparator.comparing(Student::getGender).thenComparing(Student::getGender))
				.collect(Collectors.toList());

		return sortedList;
	}

	@Override
	public List<Student> sortBySubjectAndAge() {

		List<Student> studentList = reposistory.findAll();

		List<Student> sortedList = studentList.stream()
				.sorted(Comparator.comparing(Student::getSubject).thenComparing(Student::getAge))
				.collect(Collectors.toList());

		return sortedList;
	}

}

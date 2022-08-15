package com.ab.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ab.Entities.Student;
import com.ab.Services.StudentServiceImpl;

@Controller
public class StudentController {

	@Autowired
	private StudentServiceImpl serviceImpl;

	@RequestMapping("/")
	public String mainPage(Model model) {

		List<Student> list = serviceImpl.displayAllStudents();

		model.addAttribute("list", list);

		return "main_page";

	}

	@RequestMapping("/new-student-form")
	public String newStudentForm(Model model) {

		Student student = new Student();
		model.addAttribute("student", student);

		return "new_student_form";
	}

	@PostMapping("/add")
	public String addStudent(Student student) {

		this.serviceImpl.createStudent(student);

		return "redirect:/";
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView editForm(@PathVariable("id") int id) {

		// take to the edit_student html page
		ModelAndView mvc = new ModelAndView("edit_student");
		Student student = serviceImpl.getStudentById(id);
		mvc.addObject("student", student);
		return mvc;
	}

	@RequestMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") int id) {

		this.serviceImpl.DeleteStudentById(id);
		return "redirect:/";
	}

} // end of class

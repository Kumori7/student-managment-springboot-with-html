package com.ab.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ab.Entities.Student;
import com.ab.Services.StreamServiceImpl;

@Controller
public class StreamController {

	@Autowired
	private StreamServiceImpl serviceImpl;

	@RequestMapping("/sort-by-name")
	public String sortByName(Model model) {

		List<Student> list = serviceImpl.sortByName();
		model.addAttribute("studentlist", list);

		return "sort_by_name";

	}

	@RequestMapping("/sort-by-age")
	public String sortByAge(Model model) {

		List<Student> list = serviceImpl.sortByAge();
		model.addAttribute("studentlist", list);

		return "sort_by_age";

	}

	@RequestMapping("/sort-by-subject")
	public String sortBySubject(Model model) {

		List<Student> list = serviceImpl.sortBySubject();
		model.addAttribute("studentlist", list);

		return "sort_by_subject";

	}
	
	@RequestMapping("/sort-by-gender-and-age")
	public String sortByGenderAndAge(Model model) {

		List<Student> list = serviceImpl.sortByGenderAndAge();
		model.addAttribute("studentlist", list);

		return "sort_by_gender_and_age";

	}
	
	@RequestMapping("/sort-by-subject-and-age")
	public String sortBySubjectAndAge(Model model) {

		List<Student> list = serviceImpl.sortBySubjectAndAge();
		model.addAttribute("studentlist", list);

		return "sort_by_subject_and_age";

	}

} // end of class

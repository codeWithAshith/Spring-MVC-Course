package com.codewithashith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codewithashith.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/form")
	public String showForm(Model model) {

		Student student = new Student();

		// student should match in the form
		model.addAttribute("student", student);
		
		return "studentForm";
	}

	@RequestMapping("processStudentForm")
	public String processStudentForm(@ModelAttribute("student") Student student) {
		return "processStudentForm";
	}
}

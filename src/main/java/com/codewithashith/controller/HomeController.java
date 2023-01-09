package com.codewithashith.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showPage() {
		return "index";
	}

	@RequestMapping("/showForm")
	public String showForm() {
		return "showForm";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "processForm";
	}

	// controller to read form data
	// add data to model
	@RequestMapping("/processFormTwo")
	public String processFormTwo(HttpServletRequest request, Model model) {
		// read request parameter from html form
		String name = request.getParameter("studentName");
		name = name.toUpperCase();

		model.addAttribute("message", name);

		return "processForm";
	}

	// Binding Request param
	@RequestMapping("/processFormThree")
	public String processFormThree(@RequestParam("studentName") String name, Model model) {
		name = name.toUpperCase();
		name = "Hey v3 " + name;

		model.addAttribute("message", name);

		return "processForm";
	}

}

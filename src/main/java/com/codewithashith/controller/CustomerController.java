package com.codewithashith.controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codewithashith.model.Student;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codewithashith.model.Customer;
import com.codewithashith.model.Student;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// enter whitespace to cheat the validation. 
	// Fix
	// add an initbinder - to trim the input
	// remove leading and tailing whitespace
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		
		binder.registerCustomEditor(String.class, editor);
	}

	@RequestMapping("/form")
	public String showForm(Model model) {

		Customer customer = new Customer();

		// student should match in the form
		model.addAttribute("customer", customer);
		
		return "customerForm";
	}

	// Add at valid in the same place for error handling
	@RequestMapping("processCustomerForm")
	public String processStudentForm(
			@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "customerForm";
		}
		return "processCustomerForm";
	}
}

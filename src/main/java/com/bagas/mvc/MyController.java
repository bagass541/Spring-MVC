package com.bagas.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class MyController {
	
	@RequestMapping("/")
	public String showFirstView() {
		return "first-view";
	}
	
	@RequestMapping("/askDetails")
	public String askEmployeeDetails(Model model)
	{
		model.addAttribute("employee", new Employee());
		return "ask-emp-details-view";
	}
	
	
	@PostMapping("/showDetails")
	public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult)
	{
		
//		System.out.println("surname length = " + emp.getSurname().length());
		
		if(bindingResult.hasErrors())
		{
			return "ask-emp-details-view";
		}
		else{
			return "show-emp-details-view";
		}
		
	}
	
	
	
	
	
	
	
	
	
}

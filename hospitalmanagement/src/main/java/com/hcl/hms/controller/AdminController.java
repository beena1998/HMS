package com.hcl.hms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.hms.model.Admin;
import com.hcl.hms.model.Patient;
import com.hcl.hms.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	
	@GetMapping(value = "addAdmin")
	public String entrollAdmin(Model model) {

		model.addAttribute("admin", new Admin());
	
		return "addAdmin";

	}
	@PostMapping(value="saveAdmin")
	public String afterEnrollPatient(@Valid @ModelAttribute("admin") Admin admin, BindingResult bindingResult,
			Model model) {
		if (bindingResult.hasErrors()) {
			return "addAdmin";
		}
	      admin= adminService.addAdmin(admin);

		model.addAttribute("admin", admin);
			
			return "adminLogin";
		
		

	}
	
	@GetMapping(value="adminLogin")
	public String adminLogin() {
		return "adminLogin";
	}
	@PostMapping(value="afterAdminLogin")
	public String getAdmin(@RequestParam("email") String email, @RequestParam("password") String 
			password, Model model) {
		Admin admin = adminService.getAdmin(email, password);
		if(admin!=null){
			model.addAttribute("admin", admin);
			model.addAttribute("succcessMessage", "Patient succcessfully Login!!");
			return "home";
		}
		else {
			String errMessage = "Invalid Admin credentials";
			
			model.addAttribute("error", errMessage);
			return "adminLogin";
		}
		
	}
	
}

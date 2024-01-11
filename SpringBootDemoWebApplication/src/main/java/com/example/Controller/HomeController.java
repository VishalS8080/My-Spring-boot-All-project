package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.SpringBoot.entity.Student;
import com.example.service.HomeService;

@Controller
public class HomeController {
	@Autowired
	private HomeService homeservice;
	
	
	@RequestMapping(value="/")
	public String getIndexpage() {
		
		return "index";
	}
	
	@RequestMapping(value="/Log")
	public String getLogininData(@RequestParam String uname,@RequestParam String pass,Model model) {
		List<Student> slist = homeservice.getloginData(uname,pass);
		System.out.println("Login Credentials :"+uname+" "+pass);
		if(slist.size() > 0) {
		model.addAttribute("list",slist);
		return "success";
		}else {
			model.addAttribute("msg", "Invalide usename and password.");
			return "index";
		}
	}
	@RequestMapping (value="/reg")
	public String getRegisterData(@ModelAttribute Student student) {
		System.out.println("Data check:" + student);
		homeservice.saveStudentData(student);
		return "index";
	}

}

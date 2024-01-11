package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.LoginService;
import com.example.demo.entity.Login;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping(value = "/emp/save")
	public String saveLoginDataWithEmployee(@RequestBody Login login) {
		System.out.println("Login Data :"+ login);
		loginService.saveLoginData(login);
		
		return"successfully added..!!";
	}
      @GetMapping(value ="/emp/get")
       public ResponseEntity<Login>getloginData(@RequestParam String uname,@RequestParam String pass){
    	  System.out.println("login creaditials: "+uname+"  " +pass);
    	 Login login = loginService.getLoginDetails(uname,pass);
    	  return ResponseEntity.ok(login);
      }
}

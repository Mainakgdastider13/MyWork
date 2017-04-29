package com.niit.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/helloPage")
	 public String helloPage(){
		 return "helloPage";
	 }
	@RequestMapping("/welcome")
public String welcomePage(){
	return "welcomePage";
}
	@RequestMapping("/anu")
	public String aPage(){
		return "AnuPage";
	}
	//http://localhost:8080/mvcdemo/getUserForm
		@RequestMapping("/getUserForm")
		public String getUserForm(){
			return "sayHelloToUser";
			// WEB-INF/pages/sayHelloToUser.jsp
		}
		//Display the form , enter the data, on submit call helloUser
		@RequestMapping("/helloUser")
		public String sayHelloToUser(HttpServletRequest request,Model model){
			String name=request.getParameter("name");
			String ps=request.getParameter("pass");
			if(ps.compareTo("Sona")==0)
			{
				model.addAttribute("message","Welcome:"+name+" UR Authenticated to this site");
			}
			else
			{
				model.addAttribute("message","Sorry  " + name+" UR Authentication failed");
			}
			
			return "sayHelloToUser";
		}
		
		
}

package com.niit.controllers;
import com.niit.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PersonController
{
	//http://localhost:8080/mvcdemo/personForm
    @RequestMapping("/personForm")
	public String getPersonForm(Model model){
		model.addAttribute("personObj",new Person());
		return "personform";
	}
    
    public String getPersonDetails(@ModelAttribute(value="personObj")  Person person,Model model){
    	model.addAttribute("personObj",person);
    	return "persondetails";
    	
    }
}

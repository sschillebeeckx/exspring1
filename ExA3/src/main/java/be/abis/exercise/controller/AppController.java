package be.abis.exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import be.abis.exercise.service.CourseService;

@Controller
public class AppController {
     
	@Autowired
	CourseService courseService;
	
	@GetMapping("/")
	public String printCourse(Model model){
		String title = courseService.findCourse(7900).getShortTitle();
		model.addAttribute("coursetitle", title);		
		return "course";
	}
}

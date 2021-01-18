package com.example.controller;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("home")
	public String login() {
		return "home";
	}
	
	@PostMapping("friday")
	public String Result(@RequestParam("date")String dateString, Model model) {
		LocalDate localDate = LocalDate.parse(dateString, DateTimeFormatter.ISO_DATE);
		if(localDate.getDayOfWeek() == DayOfWeek.FRIDAY) {
			return "friday";
		};		
		return "redirect:home";
	}
}

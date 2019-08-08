package com.wow.battle;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "list";
	}
	
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Locale locale, Model model) {
		return "input";
	}
	
	@RequestMapping(value = "/input_data", method = RequestMethod.GET)
	public String input_data(Locale locale, Model model) {
		return "list";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modify(Locale locale, Model model) {
		return "modify";
	}
	
	@RequestMapping(value = "/modify_data", method = RequestMethod.GET)
	public String modify_data(Locale locale, Model model) {
		return "list";
	}
	
//	@RequestMapping(value = "/delete", method = RequestMethod.GET)
//	public String delete(Locale locale, Model model) {
//		return "list";
//	}
	
	@RequestMapping(value = "/game_start", method = RequestMethod.GET)
	public String battle(Locale locale, Model model) {
		return "battle";
	}
	
	@RequestMapping(value = "/done", method = RequestMethod.GET)
	public String done(Locale locale, Model model) {
		return "done";
	}
	
	@RequestMapping(value = "/temp", method = RequestMethod.GET)
	public String temp(Locale locale, Model model) {
		return "list";
	}
	
}

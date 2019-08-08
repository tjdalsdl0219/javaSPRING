package com.movepage.myapp;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpServletRequest request) {
	 
	return "list";
	}
	
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Locale locale, Model model, HttpServletRequest request) {
	 
	return "input";
	}
	

	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modify(Locale locale, Model model, HttpServletRequest request) {
	 
	return "modify";
	}

	@RequestMapping(value = "/sign_in", method = RequestMethod.GET)
	public String singIn(Locale locale, Model model, HttpServletRequest request) {
	 
	return "sign_in";
	}
	
	@RequestMapping(value = "/done", method = RequestMethod.GET)
	public String done(Locale locale, Model model, HttpServletRequest request) {
	 
	return "done";
	}
	
}

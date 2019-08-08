package com.politec.jty;

import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.util.Date;
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
	public String list(Locale locale, Model model) {
		return "list";
	}
	
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Locale locale, Model model) {		
		return "input";
	}
	
	@RequestMapping(value = "/input_data", method = RequestMethod.GET)
	public String inputData(Locale locale, Model model) {
		return "done";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String update(Locale locale, Model model) {		
		return "modify";
	}
	
	@RequestMapping(value = "/update_data", method = RequestMethod.GET)
	public String updateData(Locale locale, Model model) {
		return "done";
	}
	
	
	@RequestMapping(value = "/sign_in", method = RequestMethod.GET)
	public String singin(Locale locale, Model model) {		
		return "signIn";
	}
	
	@RequestMapping(value = "/do_sign_in", method = RequestMethod.GET)
	public String doSignIn(Locale locale, Model model) {
		if (true) {
			return "redirect:/";
		} else {
			return "redirect:/sign_in";
		}
	}		
}

package com.seul.Spring06142;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String home(Locale locale, Model model) {
			return "list";
		}
	
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Locale locale, Model model) {
			return "input";
		}
	
	
	@RequestMapping(value = "/input_data", method = RequestMethod.GET) //데이터 넣기
	public String inputData(Locale locale, Model model) {
			return "done";
		}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET) //수정페이지
	public String modify(Locale locale, Model model) {
		return "modify";
	}
	
	@RequestMapping(value = "/update_data", method = RequestMethod.GET)
	public String updateData() {
		return "done";
	}
	
	@RequestMapping(value = "/sign_in", method = RequestMethod.GET)
	public String signIn(Locale locale, Model model) {
		return "sign_in";
	}
	
	@RequestMapping(value = "/sign_out", method = RequestMethod.GET)
	public String signOut(Locale locale, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/sign_in";
	}
	
	@RequestMapping(value = "/do_sign_in", method = RequestMethod.GET)
	public String doSignIn(Locale locale, Model model) {
			return "redirect:/sign_in";
	}
	
}

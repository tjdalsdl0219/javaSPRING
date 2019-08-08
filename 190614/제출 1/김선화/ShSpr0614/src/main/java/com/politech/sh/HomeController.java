package com.politech.sh;

import java.security.MessageDigest;
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

import com.politech.sh.DBCommon;
import com.politech.sh.Peoson;

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
		HttpSession session = request.getSession();
		Object isSignIn = session.getAttribute("sign_in");
		if ( isSignIn != null && (Boolean)isSignIn) {
		DBCommon<Peoson> dbCommon = new DBCommon<Peoson>("E:\\tomcat\\student190527.sqlite", "student");
		model.addAttribute("select_result", dbCommon.selectDataTableTag(new Peoson()));
		return "list";
		}
		return "redirect:/sign_in";
	}
	
	@RequestMapping(value = "/sign_in", method = RequestMethod.GET)
	public String signIn(Locale locale, Model model) {
		return "sign_in";
	}

	@RequestMapping(value = "/sign_out", method = RequestMethod.GET)
//	session의 data를 전부 날려버림 -> session.invalidate() 사용
	public String doSignIn(Locale locale, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/";
	}
	
	
	@RequestMapping(value = "/do_sign_in", method = RequestMethod.GET)
	public String doSignIn(Locale locale, Model model, HttpServletRequest request, @RequestParam("id") String id, @RequestParam("password") String password) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-256");
			md.update(password.getBytes());
			StringBuilder sb = new StringBuilder();
			for (byte b : md.digest()) {
				sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
			}
			password = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		DBCommon<Peoson> dbCommon = new DBCommon<Peoson>("E:\\tomcat\\student190527.sqlite", "student");
		if (dbCommon.signIn(id, password)) {
			HttpSession session = request.getSession();
			session.setAttribute("sign_in", true);
			return "redirect:/";
		} else {
			return "redirect:/sign_in";
		}
	}
	

	
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Locale locale, Model model) {
		
		
		return "modify";
	}
	
	
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modify(Locale locale, Model model) {

		return "modify";
	}
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String reList(Locale locale, Model model) {
		DBCommon<Peoson> dbCommon = new DBCommon<Peoson>("E:\\tomcat\\student190527.sqlite", "student");
		model.addAttribute("select_result", dbCommon.selectDataTableTag(new Peoson()));
		return "list";
	}
	@RequestMapping(value = "/update_data", method = RequestMethod.GET)
	public String updateData(Locale locale, Model model) {
		
		return "done";
	}
	
}

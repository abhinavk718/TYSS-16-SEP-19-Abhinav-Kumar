package com.ty.retailer.controller;



import java.util.Date;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ty.retailer.dto.OrderBean;
import com.ty.retailer.dto.ProductBean;
import com.ty.retailer.dto.RetailerBean;
import com.ty.retailer.service.RetailerService;

@Controller
public class RetailerController {


	@Autowired
	private RetailerService service;

	@GetMapping("/login")
	public String loginPgae() {
		return "login";
	}// end of login page


	@PostMapping("/login")
	public String login(int id, String password,
			HttpServletRequest request) {
		RetailerBean bean=service.login(id, password);
		if(bean==null) {
			request.setAttribute("msg", "Invaid Credentials");
			return "login";
		}else {
			HttpSession session=request.getSession();
			session.setAttribute("bean",bean);
			return "home";
		}
	}// end of login()

	@GetMapping("/createprofile")
	public String createProfilePage() {
		return "createprofile";
	}//end of createprofilePage()
	@PostMapping("/createprofile")
	public String register(RetailerBean bean,ModelMap map) {
		int check = service.createProfile(bean);
		if(check>0) {
			map.addAttribute("msg","You are Registered and Id is "+check);
		}else {
			map.addAttribute("msg","Email is Required");
		}
		return "login";
	}//end of createprofile()
	
	@GetMapping("/home")
	public String home(ModelMap map, @SessionAttribute(name="bean", required = false)RetailerBean bean) {
		if(bean==null) {
			map.addAttribute("msg", "Login First!!!!!");
			return "login";
		}
		else {
			return "home";
		}
	}//end of home()

	@PostMapping("/home")
	public String homePage() {
		return "home";
	}//end of homePage() post mapping
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
	@GetMapping("/updatepassword")
	public String changePassword(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(session!=null) {
			return "updatepassword";
		}
		else {
			return "login";
		}
	}//end of changePassword()
	@PostMapping("/updatepassword")
	public String changePassword(String password, String confirmpassword,@SessionAttribute(name="bean")RetailerBean bean,ModelMap map) {

		if(password.equals(confirmpassword)) {
			service.updatePassword(bean.getRid(), password);
			map.addAttribute("msg","Password Changed");
		}
		else {
			map.addAttribute("msg","Password Not Matching");
		}

		return "home";
	}


	@GetMapping("/search")
	public String search(@RequestParam("pid") int id,
			ModelMap map) {
		ProductBean bean=service.searchProduct(id);
		if(bean==null) {
			map.addAttribute("msg","Data Not Found");
		}else {
			map.addAttribute("bean",bean);
		}
		return "home";

	}// end of search()

}
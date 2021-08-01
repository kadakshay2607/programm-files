package com.te.empapp.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cookies")
public class CookieController {

	@GetMapping("/showcookie")
	public String getCookie() {
		return "cookie";
	}

	@GetMapping("/createCookie")
	public String createCookie(HttpServletResponse response, ModelMap map) {

		Cookie cookie = new Cookie("FirstCookie", "empapp");
//		cookie.setMaxAge(40);
		response.addCookie(cookie);

		map.addAttribute("msg", "Cookies created successfully");

		return "cookie";
	}

	@GetMapping("/readCookie")
	public String readCookie(ModelMap map, HttpServletRequest request,
			@CookieValue(name = "JSESSIONID", required = false) String val) {

		Cookie [] cookie = request.getCookies();
		
		System.out.println(cookie[0].getValue());
		System.out.println(cookie[1].getValue());
		if(val!=null) {
			map.addAttribute("cookie" , val);
		}else {
			map.addAttribute("msg", "Cookie not found");
		}
		
		
		
		return "cookie";
	}

}

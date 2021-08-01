package com.te.empapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestDeligation {

	@GetMapping("/linkedIn")
	public String redirectToExternal() {
		return "redirect:https://www.linkedin.com";
	}

	@GetMapping("/know")
	public String redirectToInternal() {
		return "redirect:login";
	}

	@GetMapping("/forward")
	public String forwardReq() {
		return "forward:searchForm";
	}
}

package tech.csm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/", "main" })
public class MainController {

	@GetMapping({ "/", "/welcome" })
	public String welcome() {
		return "HomePage";
	}

	@GetMapping("/adminLogin")
	public String adminLogin() {
		return "AdminLoginPage";
	}

	@GetMapping("/customerLogin")
	public String customerLogin() {
		return "CustomerLoginPage";
	}

	@GetMapping("/logout")
	public String logout() {
		return "redirect:./welcome";
	}

}

package tech.csm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import tech.csm.model.Admin;
import tech.csm.service.AdminService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private AdminService adminService;

	@PostMapping("/validateAdmin")
	public String validateAdmin(Model model, HttpSession httpSession, @RequestParam Integer adminId,
			@RequestParam String adminPassword) {
		Admin admin = adminService.findAdminById(adminId);
		System.out.println(adminId + "*******************" + adminPassword);
		if (admin != null) {
			if (adminId.equals(admin.getAdminId()) && adminPassword.equals(admin.getAdminPassword())) {
				httpSession.setAttribute("admin", admin);
				model.addAttribute("msg", "Hi " + admin.getAdminName());
				return "AdminPage";
			} else {
				model.addAttribute("msg", "Wrong Password!");
				return "AdminLoginPage";
			}
		} else {
			model.addAttribute("msg", "Invalid Id");
			return "AdminLoginPage";
		}
	}
}

package tech.csm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import tech.csm.model.Product;
import tech.csm.model.Sales;
import tech.csm.service.ProductService;

@Controller
@RequestMapping("/sales")
public class SalesController {

	@Autowired
	private ProductService productService;

	@GetMapping("/showRegisterForm")
	public String showRegisterForm(Model model) {
		model.addAttribute("showForm", "yes");

		List<Product> products = productService.getAllProducts();
		model.addAttribute("products", products);
		return "AdminPage";
	}

	@GetMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute Sales sales) {
		return "redirect:./showRegisterForm";
	}
}

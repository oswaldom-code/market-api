package com.marketapi.adapters.in.rest.controllers;

import java.util.List;

import com.marketapi.aplication.services.ProductServices;
import com.marketapi.domain.models.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductServices productServices;

	@GetMapping("/all")
	public List<Product> getProducts(Model model) {
		List<Product> products = productServices.getProducts();
		return products;
	}

}

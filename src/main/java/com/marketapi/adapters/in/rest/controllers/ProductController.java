package com.marketapi.adapters.in.rest.controllers;

import java.util.List;
import java.util.Map;

import com.marketapi.adapters.in.rest.dto.PaginationResponse;
import com.marketapi.adapters.in.rest.pkg.utility.PaginationInfo;
import com.marketapi.aplication.services.ProductServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductServices productServices;

	@GetMapping("/all")
	public PaginationResponse getProducts(@RequestParam Map<String, Object> params) {
		PaginationInfo paginationInfo = new PaginationInfo(
				params,
				productServices.countProducts());
		PaginationResponse paginationResponse = new PaginationResponse(paginationInfo,
				productServices.getProducts(paginationInfo.pageRequest()).toArray());
		return paginationResponse;
	}
}

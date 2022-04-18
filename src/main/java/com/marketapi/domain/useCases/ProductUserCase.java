package com.marketapi.domain.useCases;

import java.util.List;

import com.marketapi.domain.models.Product;

import org.springframework.data.domain.Pageable;

public interface ProductUserCase {

	Product findById(Long id);

	List<Product> getProducts(Pageable pageable);

	Long countProducts();

	Product createProduct(Product product);

	Product updateProduct(Product product);

	void deleteProduct(String id);
}

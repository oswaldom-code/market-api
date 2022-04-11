package com.marketapi.domain.useCases;

import java.util.List;

import com.marketapi.domain.models.Product;

public interface ProductUserCase {

	Product getProduct(String id);

	List<Product> getProducts();

	Product createProduct(Product product);

	Product updateProduct(Product product);

	void deleteProduct(String id);

}

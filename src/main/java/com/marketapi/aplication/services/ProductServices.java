package com.marketapi.aplication.services;

import java.util.List;

import com.marketapi.aplication.ports.out.ProductPersistencePort;
import com.marketapi.domain.models.Product;
import com.marketapi.domain.useCases.ProductUserCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServices implements ProductUserCase {
	@Autowired
	ProductPersistencePort productRepository;

	public ProductServices(ProductPersistencePort productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Product getProduct(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProducts() {
		List<Product> Products = productRepository.getProducts();
		if (Products.isEmpty()) {
			throw new RuntimeException("No hay productos");
		}
		return Products;
	}

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(String id) {
		// TODO Auto-generated method stub

	}

}

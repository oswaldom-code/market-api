package com.marketapi.aplication.ports.out;

import java.util.List;
import java.util.Optional;

import com.marketapi.domain.models.Product;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;

public interface ProductPersistencePort {

	Optional<Product> getProduct(String id);

	List<Product> getProducts();

	Page<Product> findByActive(boolean published, Pageable pageable);

	// Page<Tutorial> findByTitleContaining(String title, Pageable pageable);

	Product createProduct(Product product);

	Product updateProduct(Product product);

	void deleteProduct(String id);

}

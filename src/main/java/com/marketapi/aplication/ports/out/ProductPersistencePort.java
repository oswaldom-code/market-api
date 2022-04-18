package com.marketapi.aplication.ports.out;

import java.util.List;
import java.util.Optional;

import com.marketapi.domain.models.Product;

import org.springframework.data.domain.Pageable;

public interface ProductPersistencePort {

	Optional<Product> findById(Long id);

	List<Product> getProducts(Pageable pageable);

	Long countProduct();

	Product createProduct(Product product);

	Product updateProduct(Product product);

	void deleteProduct(String id);

}

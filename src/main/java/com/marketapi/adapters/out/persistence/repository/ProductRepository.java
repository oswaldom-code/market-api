package com.marketapi.adapters.out.persistence.repository;

import java.util.List;
import java.util.Optional;

import com.marketapi.adapters.out.persistence.crud.ProductoCrudRepository;
import com.marketapi.adapters.out.persistence.entity.Producto;
import com.marketapi.adapters.out.persistence.mapper.ProductMapperImp;
import com.marketapi.aplication.ports.out.ProductPersistencePort;
import com.marketapi.domain.models.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository implements ProductPersistencePort {
	@Autowired
	public ProductoCrudRepository productoCrudRepository;

	@Autowired
	public ProductMapperImp productMapperImp;

	public ProductRepository(ProductoCrudRepository productoCrudRepository, ProductMapperImp productMapperImp) {
		this.productoCrudRepository = productoCrudRepository;
		this.productMapperImp = productMapperImp;
	}

	@Override
	public Optional<Product> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProducts(Pageable pageable) {
		Page<Producto> productos = productoCrudRepository.findAll(pageable);

		return productMapperImp.ProductosToProducts(productos);

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

	@Override
	public Long countProduct() {
		return productoCrudRepository.count();
	}

}
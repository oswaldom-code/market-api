package com.marketapi.adapters.out.persistence.crud;

import java.util.List;
import java.util.Optional;

import com.marketapi.adapters.out.persistence.entity.Producto;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
	List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

	Page<Producto> findByActive(boolean active, Pageable pageable);

	Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
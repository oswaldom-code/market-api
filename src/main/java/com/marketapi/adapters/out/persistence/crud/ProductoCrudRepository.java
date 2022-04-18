package com.marketapi.adapters.out.persistence.crud;

import java.util.List;
import java.util.Optional;

import com.marketapi.adapters.out.persistence.entity.Producto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoCrudRepository extends JpaRepository<Producto, Integer> {
	List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

	Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
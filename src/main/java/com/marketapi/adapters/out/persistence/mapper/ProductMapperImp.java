package com.marketapi.adapters.out.persistence.mapper;

import java.util.ArrayList;
import java.util.List;

import com.marketapi.adapters.out.persistence.entity.Producto;
import com.marketapi.domain.models.Product;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public class ProductMapperImp implements ProductMapper {

	@Override
	public Product ProductoToProduct(Producto producto) {
		Product product = new Product();
		product.setProductId(producto.getIdProducto());
		product.setName(producto.getNombre());
		product.setCategoryId(producto.getIdCategoria());
		product.setPrice(producto.getPrecioVenta());
		product.setStock(producto.getCantidadStock());
		product.setActive(producto.getEstado());
		return product;
	}

	@Override
	public List<Product> ProductosToProducts(Page<Producto> productos) {
		if (productos == null) {
			return null;
		}
		List<Product> listOfProduct = new ArrayList<Product>();
		for (Producto producto : productos) {
			listOfProduct.add(ProductoToProduct(producto));
		}
		return listOfProduct;
	}

	@Override
	public Producto toProducto(Product product) {
		// TODO Auto-generated method stub
		return null;
	}
}

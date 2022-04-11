package com.marketapi.adapters.out.persistence.mapper;

import com.marketapi.adapters.out.persistence.entity.Categoria;
import com.marketapi.domain.models.Category;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
	@Mappings({
			@Mapping(source = "idCategoria", target = "categoryId"),
			@Mapping(source = "descripcion", target = "category"),
			@Mapping(source = "estado", target = "active"),
	})
	Category toCategory(Categoria categoria);

	@InheritInverseConfiguration
	@Mapping(target = "productos", ignore = true)
	Categoria toCategoria(Category category);
}
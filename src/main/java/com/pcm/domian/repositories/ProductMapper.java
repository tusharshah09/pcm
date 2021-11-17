/*
 * package com.pcm.domian.repositories;
 * 
 * import org.mapstruct.Mapper; import org.mapstruct.ReportingPolicy; import
 * org.mapstruct.factory.Mappers;
 * 
 * import com.pcm.domain.entities.Product; import
 * com.pcm.domain.entities.ProductRequest;
 * 
 * 
 * @Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE) public abstract class
 * ProductMapper {
 * 
 * public static final ProductMapper MAPPER =
 * Mappers.getMapper(ProductMapper.class);
 * 
 * @org.mapstruct.Mapping(source = "id", target = "id") public abstract Product
 * map(ProductRequest productRequest);
 * 
 * @org.mapstruct.Mapping(source = "id", target = "id") public abstract
 * ProductRequest map(Product product); }
 */
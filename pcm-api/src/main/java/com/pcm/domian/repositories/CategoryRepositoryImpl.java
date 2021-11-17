/*
 * package com.pcm.domian.repositories;
 * 
 * import java.util.ArrayList; import java.util.List; import java.util.Optional;
 * import java.util.stream.Collectors;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.pcm.domain.entities.CategoryEntity; import com.pcm.model.Category;
 * 
 * import dev.techdozo.product.persistence.mapper.ProductPersistableMapper;
 * import dev.techdozo.product.persistence.repository.model.ProductPersistable;
 * 
 * 
 * 
 * public class CategoryRepositoryImpl implements CategoryRepository {
 * 
 * @Autowired CategoryDao categoryDao;
 * 
 * 
 * @Override public List<Category> findAll() {
 * 
 * List<CategoryEntity> categories = categoryDao.findAll();
 * 
 * return categories.stream() .map(CategoryMapper.MAPPER::map)
 * .collect(Collectors.toList()); }
 * 
 * 
 * 
 * @Override public List<Category> findByName(String name) {
 * 
 * return categoryDao.findByName(name).stream() .map(CategoryMapper.MAPPER::map)
 * .collect(Collectors.toList()); }
 * 
 * 
 * 
 * }
 */
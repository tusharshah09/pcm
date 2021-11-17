package com.pcm.domian.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcm.domain.entities.Category;
import com.pcm.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	List<Product> findByCategoryParentUrl(String url);
	List<Product> findByCategoryUrl(String category);
}

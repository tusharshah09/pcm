package com.pcm.domian.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.pcm.domain.entities.Category;



//@NoRepositoryBean
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	//List<Category> findAll();
	
	List<Category> findByName(String name);
	
}

package com.pcm.controller.query;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pcm.domain.entities.Category;
import com.pcm.domian.repositories.CategoryRepository;
import com.pcm.model.Response;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("categories")
public class CategoryQueryContgroller {
	
	private final  CategoryRepository repository;
	
	public CategoryQueryContgroller(CategoryRepository categoryRepository) {
		this.repository = categoryRepository;
	}
	
	@GetMapping("")
	@Operation(summary = "Get all categories.",tags = "Category Management")
	public Response<List<Category>> getCategories() {
		return null;//repository.findAll();
	}
	
	
	@GetMapping("{name}")
	@Operation(summary = "Get category by name",tags = "Category Management")
	public Response<List<Category>> getCategories(@PathVariable String name) {
		return null;//repository.findByName(name);
	}	
}

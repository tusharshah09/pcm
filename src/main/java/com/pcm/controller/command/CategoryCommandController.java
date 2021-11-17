package com.pcm.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pcm.domain.entities.Category;
import com.pcm.domian.repositories.CategoryRepository;
import com.pcm.model.request.CategoryRequest;


import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("categories")
public class CategoryCommandController {

	@Autowired
	private CategoryRepository repository;
	
	@PostMapping("")
	@Operation(summary = "Create new category.",tags = "Category Management")
	public Category createCategory(Category category) {
		return repository.save(category);
	}
	
	@PutMapping("")
	@Operation(summary = "Update category.",tags = "Category Management")
	public Category updateCategory(@PathVariable Integer id, @RequestBody CategoryRequest request) {
		//return repository.save(category);
		return null;
	}
	
	@DeleteMapping("")
	@Operation(summary = "Update category.",tags = "Category Management")
	public Category deleteCategory(Integer id) {
		return null;
	}
	
}

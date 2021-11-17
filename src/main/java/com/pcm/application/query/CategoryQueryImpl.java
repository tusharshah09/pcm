
package com.pcm.application.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcm.domain.entities.Category;
import com.pcm.domian.repositories.CategoryRepository;
import com.pcm.model.Response;

@Service
public class CategoryQueryImpl implements CategoryQuery {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Response<List<Category>> getAllCategories() {
		
		List<Category> categories = categoryRepository.findAll(); 
		
		Response<List<Category>> response = new Response<List<Category>>(); 
		
		response.setCount(categories.size());
		response.setValue(categories); 
		return response;

	}

	@Override
	public Response<List<Category>> getProductByCategory(String name) {
		
		List<Category> categories = categoryRepository.findByName(name); 
		
		Response<List<Category>> response = new Response<List<Category>>(); 
		
		response.setCount(categories.size());
		response.setValue(categories); 
		return response;
	}

	

}
 
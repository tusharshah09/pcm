package com.pcm.application.query;

import java.util.List;

import com.pcm.domain.entities.Category;
import com.pcm.model.Response;




public interface CategoryQuery {
	
	Response<List<Category>> getAllCategories();
	 
	Response<List<Category>> getProductByCategory(String name);
}

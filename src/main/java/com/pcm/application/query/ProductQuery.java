package com.pcm.application.query;

import java.util.List;

import com.pcm.domain.entities.Product;
import com.pcm.model.Response;

public interface ProductQuery {
	Response<List<Product>> getAllProducts();
	Response<List<Product>> getProductByCategory(String category);
	Response<List<Product>> getProductByCategoryAndSubCategory(String category, String subcCategory);
}

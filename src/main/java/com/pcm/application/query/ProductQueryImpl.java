package com.pcm.application.query;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcm.domain.entities.Product;
import com.pcm.domian.repositories.ProductRepository;
import com.pcm.model.Response;

@Service
public class ProductQueryImpl implements ProductQuery {

	@Autowired
	ProductRepository repository;
	
	@Override
	public Response<List<Product>> getAllProducts() {
		
		List<Product> products = repository.findAll(); 
		
		Response<List<Product>> response = new Response<List<Product>>(); 
		
		response.setCount(products.size());
		response.setValue(products); 
		return response;
		
	}

	@Override
	public Response<List<Product>> getProductByCategory(String category) {

		String url = "/" + category; 
		
		List<Product> products = repository.findByCategoryParentUrl(url);
		
		Response<List<Product>> response = new Response<List<Product>>(); 
		
		response.setCount(products.size());
		response.setValue(products); 

		return response;
		
	}

	@Override
	public Response<List<Product>> getProductByCategoryAndSubCategory(String category, String subcCategory) {

		String url = "/" + category + "/" + subcCategory; 
		
		List<Product> products = repository.findByCategoryUrl(url);
		
		Response<List<Product>> response = new Response<List<Product>>(); 
		
		response.setCount(products.size());
		response.setValue(products); 
		
		return response;
	}

}

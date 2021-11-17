package com.pcm.application.command;

import java.text.ParseException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcm.domain.entities.Product;
import com.pcm.domian.repositories.ProductRepository;
import com.pcm.exceptions.ProductNotFoundException;
import com.pcm.model.request.ProductRequest;

@Service
public class ProductCommandImpl implements ProductCommand {

	@Autowired
	ProductRepository repository;
	
	@Autowired
	private ModelMapper modelMapper;
	
		
	@Override
	public Product createProduct(ProductRequest request) throws ParseException {
		Product productEntity = MapToEntity(request);
		return repository.saveAndFlush(productEntity);
	}

	@Override
	public Product updateProdduct(ProductRequest request) {
		
		Product prodductToUpdate = repository.findById(request.getId()).orElseThrow(ProductNotFoundException::new);

		prodductToUpdate.setIsActive(request.getIsActive());
		prodductToUpdate.setDescription(request.getDescription());
		prodductToUpdate.setDiscount(request.getDiscount());
		prodductToUpdate.setIsNew(request.getIsNew());
		prodductToUpdate.setName(request.getName());
		prodductToUpdate.setRetailPrice(request.getRetailPrice());
		prodductToUpdate.setSalePrice(request.getSalePrice());
		prodductToUpdate.setUrl(request.getUrl());

		return repository.saveAndFlush(prodductToUpdate);
	}

	@Override
	public boolean deleteProduct(Integer id) {
		Product productToDelete = repository.findById(id).orElseThrow(ProductNotFoundException::new);
		repository.delete(productToDelete);
		return true;
	}

	
	private Product MapToEntity(ProductRequest productRequest) throws ParseException {
		Product prodduct = modelMapper.map(productRequest, Product.class);
		return prodduct;
	}
	
	
}

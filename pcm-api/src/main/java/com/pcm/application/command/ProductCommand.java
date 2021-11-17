package com.pcm.application.command;

import java.text.ParseException;

import com.pcm.domain.entities.Product;
import com.pcm.model.Response;
import com.pcm.model.request.ProductRequest;

public interface ProductCommand {
	Product createProduct(ProductRequest product) throws ParseException;
	Product updateProdduct(ProductRequest product);
	boolean deleteProduct(Integer id);
}

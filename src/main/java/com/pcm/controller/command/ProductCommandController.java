package com.pcm.controller.command;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pcm.application.command.ProductCommand;
import com.pcm.domain.entities.Product;
import com.pcm.model.request.ProductRequest;

import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping("/products")

public class ProductCommandController {
	
	@Autowired
	ProductCommand productCommand;
	
	@PostMapping("")
	@Operation(summary = "Create a new product.", tags = "Product Management")
	public Product createProduct(@RequestBody ProductRequest request) throws ParseException {

		return  productCommand.createProduct(request);
	}


	@PutMapping("{id}")
	@Operation(summary = "Update a product.", tags = "Product Management")
	public Product updateProduct(@PathVariable Integer id, @RequestBody ProductRequest request) {

		return productCommand.updateProdduct(request);
	}


	@DeleteMapping("/{id}")
	@Operation(summary = "Delete a product.", tags = "Product Management")
	public boolean deleteProduct(@PathVariable Integer id) {

		return productCommand.deleteProduct(id);

	}
	
}

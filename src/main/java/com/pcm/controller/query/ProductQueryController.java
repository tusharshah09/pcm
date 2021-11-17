package com.pcm.controller.query;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pcm.application.query.ProductQuery;
import com.pcm.domain.entities.Product;
import com.pcm.model.Response;
import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping("/products")
public class ProductQueryController {


	@Autowired
	ProductQuery productQuery;
	
	@GetMapping("")
	@Operation(summary = "Get all products.", tags = "Product Management", description = "Gets all product catalog with category and sku.")
	public Response<List<Product>> getAllProducts() {
		return productQuery.getAllProducts();
	}

	@GetMapping(path = "/{category}", consumes = MediaType.ALL_VALUE)
	@Operation(summary = "Get all products by gategory.", tags = "Product Management")

	public Response<List<Product>> getProductsByCategory(@PathVariable String category) {
		
		return productQuery.getProductByCategory(category);

	}

	@GetMapping(path = "/{category}/{subcategory}", consumes = MediaType.ALL_VALUE)
	@Operation(summary = "Get all products by gategory and subcategory.", tags = "Product Management")

	public Response<List<Product>> getProductsByCategoryAndSubCategory(@PathVariable String category,	@PathVariable String subcategory) {

		return productQuery.getProductByCategoryAndSubCategory(category,subcategory);
    }

	/*
	 * CRUD OPERATIONS
	 */


	/*
	 * @PostMapping("")
	 * 
	 * @Operation(summary = "Create a new product.", tags = "Product Management")
	 * public Product createProduct(@RequestBody ProductRequest request) throws
	 * ParseException {
	 * 
	 * ProductCommand addCommand = productFactory.getProductCommand(); return
	 * addCommand.createProduct(request); }
	 * 
	 * 
	 * @PutMapping("{id}")
	 * 
	 * @Operation(summary = "Update a product.", tags = "Product Management") public
	 * Product updateProduct(@PathVariable Integer id, @RequestBody ProductRequest
	 * request) {
	 * 
	 * ProductCommand updateCommand = productFactory.getProductCommand(); return
	 * updateCommand.updateProdduct(request); }
	 * 
	 * 
	 * @DeleteMapping("/{id}")
	 * 
	 * @Operation(summary = "Delete a product.", tags = "Product Management") public
	 * boolean deleteProduct(@PathVariable Integer id) {
	 * 
	 * ProductCommand deleteCommand = productFactory.getProductCommand(); return
	 * deleteCommand.deleteProduct(id);
	 * 
	 * }
	 */


}

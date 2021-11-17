package com.pcm.controller.query;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pcm.domain.entities.Currency;
import com.pcm.domain.entities.Sku;
import com.pcm.model.request.CategoryRequest;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("")
public class SkuQueryController {

	@GetMapping("/skus")
	@Operation(summary = "Get all sku.", tags = "Sku Management")
	public List<Sku> getAllSkus() {
		return null;
	}
	
	
	@GetMapping("/skus/{name}")
	@Operation(summary = "Get sku by name.", tags = "Sku Management")
	public List<Sku> getSkuByName(@PathVariable String name) {
		return null;
	}
	
	@GetMapping("/skus/{id}")
	@Operation(summary = "Get sku by name.", tags = "Sku Management")
	public List<Sku> getSkuById(@PathVariable Integer id) {
		return null;
	}
	
	@PostMapping("/skus")
	@Operation(summary = "Create Sku", tags = "Sku Management")
	public List<Sku> createSkuById(@RequestBody Sku request) {
		return null;
	}
	
	@DeleteMapping("/skus/{id}")
	@Operation(summary = "Delete Sku", tags = "Sku Management")
	public List<Sku> deleteSkuById(@PathVariable Integer id) {
		return null;
	}
	
	
	@PostMapping("/sku/{skuId}/media/{meidaId}")
	@Operation(summary = "Assign sku to media.", tags = "Sku <-> Media Assignment")
	public List<Sku> assignSkuByName(@PathVariable Integer skuId, @PathVariable Integer meidaId) {
		return null;
	}
	
	@DeleteMapping("/sku/{skuId}/media/{meidaId}")
	@Operation(summary = "Remove sku from media.", tags = "Sku <-> Media Assignment")
	public List<Sku> deleteSkuByName(@PathVariable Integer skuId, @PathVariable Integer meidaId) {
		return null;
	}
	
	
	@PostMapping("/products/{productId}/skus/{skuId}")
	@Operation(summary = "Assign product to sku.", tags = "Product <-> Sku Assignment")
	public List<Sku> assignSKuToProduct(@PathVariable Integer skuId, @PathVariable Integer meidaId) {
		return null;
	}
	
	@DeleteMapping("/products/{productId}/skus/{skuId}")
	@Operation(summary = "Remove sku from media.", tags = "Product <-> Sku Assignment")
	public List<Sku> deleteSkufrpmProdcut(@PathVariable Integer skuId, @PathVariable Integer productId) {
		return null;
	}
	
	@PostMapping("/skus/{skuId}/products/{productId}")
	@Operation(summary = "Assign product to sku.", tags = "Product <-> Sku Assignment")
	public List<Sku> assignSKuToProduct1(@PathVariable Integer skuId, @PathVariable Integer meidaId) {
		return null;
	}
	
	@DeleteMapping("/skus/{skuId}/products/{productId}")
	@Operation(summary = "Remove sku from media.", tags = "Product <-> Sku Assignment")
	public List<Sku> deleteSkufrpmProdcut1(@PathVariable Integer skuId, @PathVariable Integer productId) {
		return null;
	}
	
	@GetMapping("/currency/{name}")
	@Operation(summary = "Get currency by name.", tags = "Currency Management")
	public List<Sku> getcurrByName(@PathVariable String name) {
		return null;
	}
	
	@GetMapping("/currency")
	@Operation(summary = "Get all currency.", tags = "Currency Management")
	public List<Sku> getcurAll(@PathVariable String name) {
		return null;
	}
	
	@PostMapping("/currency")
	@Operation(summary = "Create currency", tags = "Currency Management")
	public List<Sku> getcurAll(@RequestBody Currency request) {
		return null;
	}
	
	@DeleteMapping("/currency/{id}")
	@Operation(summary = "Create currency", tags = "Currency Management")
	public List<Sku> getcurAll(@PathVariable Integer id) {
		return null;
	}
	
}

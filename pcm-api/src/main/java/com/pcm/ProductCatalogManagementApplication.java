package com.pcm;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pcm.application.command.ProductCommand;

import com.pcm.application.query.ProductQuery;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

//@ComponentScan(basePackages = {"com.pcm.ProductCatalogManagementApplication"})
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Product Catalog Mamanagement API", version = "1.0", description = "Product Catalog Information"))
public class ProductCatalogManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCatalogManagementApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	
	
	
}

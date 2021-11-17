package com.pcm.controller.query;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pcm.domain.entities.Media;
import com.pcm.domain.entities.Sku;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/medias")
public class MediaQueryController {
	
	@GetMapping("")
	@Operation(summary = "Get all media.", tags = "Media Management", description = "Gets all media details.")
	public List<Media> getAllMedia() {
		return null;
	}
	
	@GetMapping("{id}")
	@Operation(summary = "Get media by id.", tags = "Media Management", description = "Get media by id.")
	public List<Media> getAllMediaById() {
		return null;
	}
	
	@PostMapping("{id}")
	@Operation(summary = "Create Media", tags = "Media Management")
	public List<Media> createMedia(@RequestBody Media request) {
		return null;
	}
	
	@DeleteMapping("{id}")
	@Operation(summary = "Delete Media", tags = "Media Management")
	public List<Media> createMedia(@PathVariable Integer Id) {
		return null;
	}
	
}

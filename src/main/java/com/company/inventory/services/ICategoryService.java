package com.company.inventory.services;

import org.springframework.http.ResponseEntity;

import com.company.inventory.model.Category;
import com.company.inventory.response.CategoryResponseRest;

public interface ICategoryService {
	
	public ResponseEntity<CategoryResponseRest> Search();
	public ResponseEntity<CategoryResponseRest> SearchById(Long id);
	public ResponseEntity<CategoryResponseRest> Save(Category category);
	public ResponseEntity<CategoryResponseRest> Update(Category category, Long id);
}

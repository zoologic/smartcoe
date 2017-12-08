package com.hcl.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import javax.transaction.Transactional;
import com.hcl.services.entities.*;
import com.hcl.services.repository.*;

/**
 * The Class CategoriesService.
 */
@Service
@Transactional
public class CategoriesService implements ICategoriesService {

	/** The categoryRepository. */
	@Autowired
	private CategoryRepository categoryRepository;
      
	/**
	 * getCategories.
	 *
     * @param categoryId the categoryId
	 * @return the List of Category
	 */
	@Override
	public List<Category> getCategories(String categoryId) {
		List<Category> list = new ArrayList<>();
if(categoryId != null && !categoryId.isEmpty()) { 
	list.add(categoryRepository.findOne(categoryId));
} else { 
	list.addAll((List<Category>)categoryRepository.findAll());
}return list;
	}
	
	/**
	 * updateCategory.
	 *
     * @param category the category
	 * @return the Category
	 */
	@Override
	public Category updateCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	/**
	 * createCategory.
	 *
     * @param category the category
	 * @return the Category
	 */
	@Override
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	/**
	 * deleteCategories.
	 *
     * @param categoryId the categoryId
	 * @return the List of Category
	 */
	@Override
	public List<Category> deleteCategories(String categoryId) {
		//TODO - Add logic to return deleted objects 
categoryRepository.delete(categoryId);return null;
	}
	
	/**
	 * getCategory.
	 *
     * @param categoryid the categoryid
	 * @return the Category
	 */
	@Override
	public Category getCategory(String categoryid) {
		return categoryRepository.findOne(categoryid);
	}
	
	/**
	 * deleteCategory.
	 *
     * @param categoryid the categoryid
	 * @return the Category
	 */
	@Override
	public Category deleteCategory(String categoryid) {
		//TODO - Add logic to return deleted objects 
categoryRepository.delete(categoryid);return null;
	}
	
       
}
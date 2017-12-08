package com.hcl.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import javax.transaction.Transactional;
import com.hcl.services.entities.*;
import com.hcl.services.repository.*;

/**
 * The Interface ICategoriesService.
 */
public interface ICategoriesService{

	/**
	 * getCategories.
	 *
     * @param categoryId the categoryId
	  * @return the List of Category
	 */
	List<Category> getCategories(String categoryId);
	
	/**
	 * updateCategory.
	 *
     * @param category the category
	  * @return the Category
	 */
	Category updateCategory(Category category);
	
	/**
	 * createCategory.
	 *
     * @param category the category
	  * @return the Category
	 */
	Category createCategory(Category category);
	
	/**
	 * deleteCategories.
	 *
     * @param categoryId the categoryId
	  * @return the List of Category
	 */
	List<Category> deleteCategories(String categoryId);
	
	/**
	 * getCategory.
	 *
     * @param categoryid the categoryid
	  * @return the Category
	 */
	Category getCategory(String categoryid);
	
	/**
	 * deleteCategory.
	 *
     * @param categoryid the categoryid
	  * @return the Category
	 */
	Category deleteCategory(String categoryid);
	

}

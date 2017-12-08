package com.hcl.services.rest;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.hcl.services.entities.*;
import com.hcl.services.service.*;

/**
* The class CategoriesController
*/
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class CategoriesController {

	/** The categoriesService. */
	@Autowired
	private ICategoriesService categoriesService;

	/**
	 *<b> Get all categories filtered by input query categoryId</b>
	 *<p> 
	 *
     * @param categoryId the categoryId
	 * @return the List of Category
	 */
	@RequestMapping(value = "/categories", method=RequestMethod.GET  , produces={"application/json", "application/xml"})
	public List<Category> getCategories(@RequestParam(value="categoryId", required=false) String categoryId) {
		return categoriesService.getCategories(categoryId);
	}
	
	/**
	 *<b> Update Category</b>
	 *<p> 
	 *
     * @param category the category
	 * @return the Category
	 */
	@RequestMapping(value = "/categories", method=RequestMethod.PUT , consumes={"application/json"} , produces={"application/json"})
	public Category updateCategory(@RequestBody(required=true) Category category) {
		return categoriesService.updateCategory(category);
	}
	
	/**
	 *<b> Create new Category</b>
	 *<p> 
	 *
     * @param category the category
	 * @return the Category
	 */
	@RequestMapping(value = "/categories", method=RequestMethod.POST , consumes={"application/json"} , produces={"application/json"})
	public Category createCategory(@RequestBody(required=true) Category category) {
		return categoriesService.createCategory(category);
	}
	
	/**
	 *<b> Delete all categories filtered by input query categoryId</b>
	 *<p> 
	 *
     * @param categoryId the categoryId
	 * @return the List of Category
	 */
	@RequestMapping(value = "/categories", method=RequestMethod.DELETE  , produces={"application/json", "application/xml"})
	public List<Category> deleteCategories(@RequestParam(value="categoryId", required=false) String categoryId) {
		return categoriesService.deleteCategories(categoryId);
	}
	
	/**
	 *<b> getCategory by category id</b>
	 *<p> 
	 *
     * @param categoryid the categoryid
	 * @return the Category
	 */
	@RequestMapping(value = "/categories/{categoryid}", method=RequestMethod.GET  , produces={"application/json"})
	public Category getCategory(@PathVariable(value="categoryid", required=true) String categoryid) {
		return categoriesService.getCategory(categoryid);
	}
	
	/**
	 *<b> delete category by id</b>
	 *<p> 
	 *
     * @param categoryid the categoryid
	 * @return the Category
	 */
	@RequestMapping(value = "/categories/{categoryid}", method=RequestMethod.DELETE , consumes={"application/json"} , produces={"application/json"})
	public Category deleteCategory(@PathVariable(value="categoryid", required=true) String categoryid) {
		return categoriesService.deleteCategory(categoryid);
	}
	

}
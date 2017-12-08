package com.hcl.services.rest;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.hcl.services.entities.*;
import com.hcl.services.service.*;

/**
* The class ProductsController
*/
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ProductsController {

	/** The productsService. */
	@Autowired
	private IProductsService productsService;

	/**
	 *<b> Get All Products or filtered by categoryId</b>
	 *<p> 
	 *
     * @param categoryid the categoryid
	 * @return the List of Product
	 */
	@RequestMapping(value = "/products", method=RequestMethod.GET , consumes={"application/json"} , produces={"application/json"})
	public List<Product> getProducts(@RequestParam(value="categoryid", required=true) String categoryid) {
		return productsService.getProducts(categoryid);
	}
	
	/**
	 *<b> Update Product</b>
	 *<p> 
	 *
     * @param product the product
	 * @return the Product
	 */
	@RequestMapping(value = "/products", method=RequestMethod.PUT , consumes={"application/json"} , produces={"application/json"})
	public Product updateProduct(@RequestBody(required=true) Product product) {
		return productsService.updateProduct(product);
	}
	
	/**
	 *<b> Add Product</b>
	 *<p> 
	 *
     * @param product the product
	 * @return the Product
	 */
	@RequestMapping(value = "/products", method=RequestMethod.POST , consumes={"application/json"} , produces={"application/json"})
	public Product addProduct(@RequestBody(required=true) Product product) {
		return productsService.addProduct(product);
	}
	
	/**
	 *<b> Delete all products or by product id</b>
	 *<p> 
	 *
     * @param productId the productId
	 * @return the List of Product
	 */
	@RequestMapping(value = "/products", method=RequestMethod.DELETE  , produces={"application/json"})
	public List<Product> deleteProducts(@RequestParam(value="productId", required=false) String productId) {
		return productsService.deleteProducts(productId);
	}
	

}
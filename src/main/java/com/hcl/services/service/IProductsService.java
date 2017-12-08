package com.hcl.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import javax.transaction.Transactional;
import com.hcl.services.entities.*;
import com.hcl.services.repository.*;

/**
 * The Interface IProductsService.
 */
public interface IProductsService{

	/**
	 * getProducts.
	 *
     * @param categoryid the categoryid
	  * @return the List of Product
	 */
	List<Product> getProducts(String categoryid);
	
	/**
	 * updateProduct.
	 *
     * @param product the product
	  * @return the Product
	 */
	Product updateProduct(Product product);
	
	/**
	 * addProduct.
	 *
     * @param product the product
	  * @return the Product
	 */
	Product addProduct(Product product);
	
	/**
	 * deleteProducts.
	 *
     * @param productId the productId
	  * @return the List of Product
	 */
	List<Product> deleteProducts(String productId);
	

}

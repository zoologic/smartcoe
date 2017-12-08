package com.hcl.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import javax.transaction.Transactional;
import com.hcl.services.entities.*;
import com.hcl.services.repository.*;

/**
 * The Class ProductsService.
 */
@Service
@Transactional
public class ProductsService implements IProductsService {

	/** The productRepository. */
	@Autowired
	private ProductRepository productRepository;
      
	/**
	 * getProducts.
	 *
     * @param categoryid the categoryid
	 * @return the List of Product
	 */
	@Override
	public List<Product> getProducts(String categoryid) {
		List<Product> list = new ArrayList<>();
if(categoryid != null && !categoryid.isEmpty()) { 
	list.add(productRepository.findOne(categoryid));
} else { 
	list.addAll((List<Product>)productRepository.findAll());
}return list;
	}
	
	/**
	 * updateProduct.
	 *
     * @param product the product
	 * @return the Product
	 */
	@Override
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}
	
	/**
	 * addProduct.
	 *
     * @param product the product
	 * @return the Product
	 */
	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
	
	/**
	 * deleteProducts.
	 *
     * @param productId the productId
	 * @return the List of Product
	 */
	@Override
	public List<Product> deleteProducts(String productId) {
		//TODO - Add logic to return deleted objects 
productRepository.delete(productId);return null;
	}
	
       
}
package com.hcl.services.repository;


import org.springframework.data.repository.CrudRepository;
import com.hcl.services.entities.Product;

/**
 * The Interface ProductRepository.
 */
public interface ProductRepository extends CrudRepository<Product, String>{


}
package com.hcl.services.repository;


import org.springframework.data.repository.CrudRepository;
import com.hcl.services.entities.Category;

/**
 * The Interface CategoryRepository.
 */
public interface CategoryRepository extends CrudRepository<Category, String>{


}
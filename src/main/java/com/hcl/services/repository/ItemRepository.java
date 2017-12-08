package com.hcl.services.repository;


import org.springframework.data.repository.CrudRepository;
import com.hcl.services.entities.Item;

/**
 * The Interface ItemRepository.
 */
public interface ItemRepository extends CrudRepository<Item, String>{


}
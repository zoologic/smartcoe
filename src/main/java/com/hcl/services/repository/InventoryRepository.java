package com.hcl.services.repository;


import org.springframework.data.repository.CrudRepository;
import com.hcl.services.entities.Inventory;

/**
 * The Interface InventoryRepository.
 */
public interface InventoryRepository extends CrudRepository<Inventory, String>{


}
package com.hcl.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import javax.transaction.Transactional;
import com.hcl.services.entities.*;
import com.hcl.services.repository.*;

/**
 * The Class InventoryService.
 */
@Service
@Transactional
public class InventoryService implements IInventoryService {

	/** The inventoryRepository. */
	@Autowired
	private InventoryRepository inventoryRepository;
      
	/**
	 * getInventories.
	 *
     * @param itemid the itemid
	 * @return the List of Inventory
	 */
	@Override
	public List<Inventory> getInventories(String itemid) {
		List<Inventory> list = new ArrayList<>();
if(itemid != null && !itemid.isEmpty()) { 
	list.add(inventoryRepository.findOne(itemid));
} else { 
	list.addAll((List<Inventory>)inventoryRepository.findAll());
}return list;
	}
	
	/**
	 * addToInventory.
	 *
     * @param item the item
	 * @return the Inventory
	 */
	@Override
	public Inventory addToInventory(Inventory item) {
		return inventoryRepository.save(item);
	}
	
	/**
	 * deleteInventory.
	 *
     * @param itemid the itemid
	 * @return the List of Inventory
	 */
	@Override
	public List<Inventory> deleteInventory(String itemid) {
		//TODO - Add logic to return deleted objects 
inventoryRepository.delete(itemid);return null;
	}
	
	/**
	 * getInventory.
	 *
     * @param itemid the itemid
	 * @return the Inventory
	 */
	@Override
	public Inventory getInventory(String itemid) {
		return inventoryRepository.findOne(itemid);
	}
	
	/**
	 * decrementInventory.
	 *
     * @param itemid the itemid
     * @param count the count
	 
	 */
	@Override
	public void decrementInventory(String itemid, int count) {
		//TODO GET calls with void return type are assumed to be peforming logic. Write your own logic here
	}
	
	/**
	 * incrementInventory.
	 *
     * @param itemid the itemid
     * @param count the count
	 
	 */
	@Override
	public void incrementInventory(String itemid, int count) {
		//TODO GET calls with void return type are assumed to be peforming logic. Write your own logic here
	}
	
       
}
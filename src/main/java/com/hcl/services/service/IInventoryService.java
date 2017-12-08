package com.hcl.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import javax.transaction.Transactional;
import com.hcl.services.entities.*;
import com.hcl.services.repository.*;

/**
 * The Interface IInventoryService.
 */
public interface IInventoryService{

	/**
	 * getInventories.
	 *
     * @param itemid the itemid
	  * @return the List of Inventory
	 */
	List<Inventory> getInventories(String itemid);
	
	/**
	 * addToInventory.
	 *
     * @param item the item
	  * @return the Inventory
	 */
	Inventory addToInventory(Inventory item);
	
	/**
	 * deleteInventory.
	 *
     * @param itemid the itemid
	  * @return the List of Inventory
	 */
	List<Inventory> deleteInventory(String itemid);
	
	/**
	 * getInventory.
	 *
     * @param itemid the itemid
	  * @return the Inventory
	 */
	Inventory getInventory(String itemid);
	
	/**
	 * decrementInventory.
	 *
     * @param itemid the itemid
     * @param count the count
	  
	 */
	void decrementInventory(String itemid, int count);
	
	/**
	 * incrementInventory.
	 *
     * @param itemid the itemid
     * @param count the count
	  
	 */
	void incrementInventory(String itemid, int count);
	

}

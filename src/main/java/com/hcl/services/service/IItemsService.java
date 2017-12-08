package com.hcl.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import javax.transaction.Transactional;
import com.hcl.services.entities.*;
import com.hcl.services.repository.*;

/**
 * The Interface IItemsService.
 */
public interface IItemsService{

	/**
	 * getItems.
	 *
     * @param productid the productid
     * @param supplierid the supplierid
	  * @return the List of Item
	 */
	List<Item> getItems(String productid, String supplierid);
	
	/**
	 * updateItem.
	 *
     * @param item the item
	  * @return the Item
	 */
	Item updateItem(Item item);
	
	/**
	 * addItem.
	 *
     * @param item the item
	  * @return the Item
	 */
	Item addItem(Item item);
	
	/**
	 * deleteItems.
	 *
     * @param itemid the itemid
     * @param productid the productid
     * @param supplierid the supplierid
	  * @return the List of Item
	 */
	List<Item> deleteItems(String itemid, String productid, String supplierid);
	
	/**
	 * getItemBySupplierId.
	 *
     * @param productid the productid
     * @param supplierid the supplierid
	  * @return the List of Item
	 */
	List<Item> getItemBySupplierId(String productid, String supplierid);
	

}

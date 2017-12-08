package com.hcl.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import javax.transaction.Transactional;
import com.hcl.services.entities.*;
import com.hcl.services.repository.*;

/**
 * The Class ItemsService.
 */
@Service
@Transactional
public class ItemsService implements IItemsService {

	/** The itemRepository. */
	@Autowired
	private ItemRepository itemRepository;
      
	/**
	 * getItems.
	 *
     * @param productid the productid
     * @param supplierid the supplierid
	 * @return the List of Item
	 */
	@Override
	public List<Item> getItems(String productid, String supplierid) {
		List<Item> list = new ArrayList<>();
if(productid != null && !productid.isEmpty()) { 
	list.add(itemRepository.findOne(productid));
} else { 
	list.addAll((List<Item>)itemRepository.findAll());
}return list;
	}
	
	/**
	 * updateItem.
	 *
     * @param item the item
	 * @return the Item
	 */
	@Override
	public Item updateItem(Item item) {
		return itemRepository.save(item);
	}
	
	/**
	 * addItem.
	 *
     * @param item the item
	 * @return the Item
	 */
	@Override
	public Item addItem(Item item) {
		return itemRepository.save(item);
	}
	
	/**
	 * deleteItems.
	 *
     * @param itemid the itemid
     * @param productid the productid
     * @param supplierid the supplierid
	 * @return the List of Item
	 */
	@Override
	public List<Item> deleteItems(String itemid, String productid, String supplierid) {
		//TODO - Add logic to return deleted objects 
itemRepository.delete(itemid);return null;
	}
	
	/**
	 * getItemBySupplierId.
	 *
     * @param productid the productid
     * @param supplierid the supplierid
	 * @return the List of Item
	 */
	@Override
	public List<Item> getItemBySupplierId(String productid, String supplierid) {
		List<Item> list = new ArrayList<>();
if(productid != null && !productid.isEmpty()) { 
	list.add(itemRepository.findOne(productid));
} else { 
	list.addAll((List<Item>)itemRepository.findAll());
}return list;
	}
	
       
}
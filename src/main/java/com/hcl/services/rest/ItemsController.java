package com.hcl.services.rest;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.hcl.services.entities.*;
import com.hcl.services.service.*;

/**
* The class ItemsController
*/
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ItemsController {

	/** The itemsService. */
	@Autowired
	private IItemsService itemsService;

	/**
	 *<b> getItems</b>
	 *<p> 
	 *
     * @param productid the productid
     * @param supplierid the supplierid
	 * @return the List of Item
	 */
	@RequestMapping(value = "/items", method=RequestMethod.GET , consumes={"application/json"} , produces={"application/json"})
	public List<Item> getItems(@RequestParam(value="productid", required=false) String productid, @RequestParam(value="supplierid", required=false) String supplierid) {
		return itemsService.getItems(productid, supplierid);
	}
	
	/**
	 *<b> Update Item</b>
	 *<p> 
	 *
     * @param item the item
	 * @return the Item
	 */
	@RequestMapping(value = "/items", method=RequestMethod.PUT , consumes={"application/json"} , produces={"application/json"})
	public Item updateItem(@RequestBody(required=true) Item item) {
		return itemsService.updateItem(item);
	}
	
	/**
	 *<b> Add Item</b>
	 *<p> 
	 *
     * @param item the item
	 * @return the Item
	 */
	@RequestMapping(value = "/items", method=RequestMethod.POST , consumes={"application/json"} , produces={"application/json"})
	public Item addItem(@RequestBody(required=true) Item item) {
		return itemsService.addItem(item);
	}
	
	/**
	 *<b> Delete items by itemId or productId or supplierId</b>
	 *<p> 
	 *
     * @param itemid the itemid
     * @param productid the productid
     * @param supplierid the supplierid
	 * @return the List of Item
	 */
	@RequestMapping(value = "/items", method=RequestMethod.DELETE , consumes={"application/json"} , produces={"application/json"})
	public List<Item> deleteItems(@RequestParam(value="itemid", required=false) String itemid, @RequestParam(value="productid", required=false) String productid, @RequestParam(value="supplierid", required=false) String supplierid) {
		return itemsService.deleteItems(itemid, productid, supplierid);
	}
	
	/**
	 *<b> getItemBySupplierId</b>
	 *<p> 
	 *
     * @param productid the productid
     * @param supplierid the supplierid
	 * @return the List of Item
	 */
	@RequestMapping(value = "/items/{supplierid}", method=RequestMethod.GET , consumes={"application/json"} , produces={"application/json"})
	public List<Item> getItemBySupplierId(@RequestParam(value="productid", required=false) String productid, @PathVariable(value="supplierid", required=true) String supplierid) {
		return itemsService.getItemBySupplierId(productid, supplierid);
	}
	

}
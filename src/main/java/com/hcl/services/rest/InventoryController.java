package com.hcl.services.rest;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.hcl.services.entities.*;
import com.hcl.services.service.*;

/**
* The class InventoryController
*/
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class InventoryController {

	/** The inventoryService. */
	@Autowired
	private IInventoryService inventoryService;

	/**
	 *<b> Get inventory list / filter by itemid</b>
	 *<p> 
	 *
     * @param itemid the itemid
	 * @return the List of Inventory
	 */
	@RequestMapping(value = "/inventory", method=RequestMethod.GET , consumes={"application/json"} , produces={"application/json"})
	public List<Inventory> getInventories(@RequestParam(value="itemid", required=false) String itemid) {
		return inventoryService.getInventories(itemid);
	}
	
	/**
	 *<b> Add to inventory</b>
	 *<p> 
	 *
     * @param item the item
	 * @return the Inventory
	 */
	@RequestMapping(value = "/inventory", method=RequestMethod.POST , consumes={"application/json"} , produces={"application/json"})
	public Inventory addToInventory(@RequestBody(required=true) Inventory item) {
		return inventoryService.addToInventory(item);
	}
	
	/**
	 *<b> Delete inventory list or filtered by itemid</b>
	 *<p> 
	 *
     * @param itemid the itemid
	 * @return the List of Inventory
	 */
	@RequestMapping(value = "/inventory", method=RequestMethod.DELETE  , produces={"application/json"})
	public List<Inventory> deleteInventory(@RequestParam(value="itemid", required=false) String itemid) {
		return inventoryService.deleteInventory(itemid);
	}
	
	/**
	 *<b> getInventory</b>
	 *<p> 
	 *
     * @param itemid the itemid
	 * @return the Inventory
	 */
	@RequestMapping(value = "/inventory/{itemid}", method=RequestMethod.GET , consumes={"application/json"} , produces={"application/json"})
	public Inventory getInventory(@PathVariable(value="itemid", required=true) String itemid) {
		return inventoryService.getInventory(itemid);
	}
	
	/**
	 *<b> decrementInventory</b>
	 *<p> 
	 *
     * @param itemid the itemid
     * @param count the count
	 
	 */
	@RequestMapping(value = "/inventory/{itemid}/decrement/{count}", method=RequestMethod.GET , consumes={"application/json"} , produces={"application/json"})
	public void decrementInventory(@PathVariable(value="itemid", required=true) String itemid, @PathVariable(value="count", required=true) int count) {
		inventoryService.decrementInventory(itemid, count);
	}
	
	/**
	 *<b> Increment Inventory value for the input itemid by the input count value</b>
	 *<p> 
	 *
     * @param itemid the itemid
     * @param count the count
	 
	 */
	@RequestMapping(value = "/inventory/{itemid}/increment/{count}", method=RequestMethod.GET , consumes={"application/json"} , produces={"application/json"})
	public void incrementInventory(@PathVariable(value="itemid", required=true) String itemid, @PathVariable(value="count", required=true) int count) {
		inventoryService.incrementInventory(itemid, count);
	}
	

}
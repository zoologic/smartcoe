package com.hcl.services.entities;

import javax.persistence.*;
import java.util.*;

/**
* The class Inventory
*/
@Entity
//TODO Set the @Id annotation for the primary key field

public class Inventory {

	
	/** The id .*/
	private String id;
	
	/** The itemId .*/
	private String itemId;
	
	/** The qty .*/
	private int qty;
    
	 /**
     * Gets the id
     *
     * @return the id
     */
	public String getId() {
		return id;
	}
	
	 /**
     * Sets the id
     *
     * @param id the newid
     */
	public void setId(String id) {
		this.id = id;
	}
	 /**
     * Gets the itemId
     *
     * @return the itemId
     */
	public String getItemId() {
		return itemId;
	}
	
	 /**
     * Sets the itemId
     *
     * @param itemId the newitemId
     */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	 /**
     * Gets the qty
     *
     * @return the qty
     */
	public int getQty() {
		return qty;
	}
	
	 /**
     * Sets the qty
     *
     * @param qty the newqty
     */
	public void setQty(int qty) {
		this.qty = qty;
	}
}
package com.hcl.services.entities;

import javax.persistence.*;
import java.util.*;

/**
* The class Item
*/
@Entity
//TODO Set the @Id annotation for the primary key field

public class Item {

	
	/** The id .*/
	@Id
	private String id;
	
	/** The image .*/
	private String image;
	
	/** The itemId .*/
	private String itemId;
	
	/** The listPrice .*/
	private String listPrice;
	
	/** The name .*/
	private String name;
	
	/** The productId .*/
	private String productId;
	
	/** The status .*/
	private String status;
	
	/** The supplierId .*/
	private String supplierId;
	
	/** The unitCost .*/
	private String unitCost;
    
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
     * Gets the image
     *
     * @return the image
     */
	public String getImage() {
		return image;
	}
	
	 /**
     * Sets the image
     *
     * @param image the newimage
     */
	public void setImage(String image) {
		this.image = image;
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
     * Gets the listPrice
     *
     * @return the listPrice
     */
	public String getListPrice() {
		return listPrice;
	}
	
	 /**
     * Sets the listPrice
     *
     * @param listPrice the newlistPrice
     */
	public void setListPrice(String listPrice) {
		this.listPrice = listPrice;
	}
	 /**
     * Gets the name
     *
     * @return the name
     */
	public String getName() {
		return name;
	}
	
	 /**
     * Sets the name
     *
     * @param name the newname
     */
	public void setName(String name) {
		this.name = name;
	}
	 /**
     * Gets the productId
     *
     * @return the productId
     */
	public String getProductId() {
		return productId;
	}
	
	 /**
     * Sets the productId
     *
     * @param productId the newproductId
     */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	 /**
     * Gets the status
     *
     * @return the status
     */
	public String getStatus() {
		return status;
	}
	
	 /**
     * Sets the status
     *
     * @param status the newstatus
     */
	public void setStatus(String status) {
		this.status = status;
	}
	 /**
     * Gets the supplierId
     *
     * @return the supplierId
     */
	public String getSupplierId() {
		return supplierId;
	}
	
	 /**
     * Sets the supplierId
     *
     * @param supplierId the newsupplierId
     */
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	 /**
     * Gets the unitCost
     *
     * @return the unitCost
     */
	public String getUnitCost() {
		return unitCost;
	}
	
	 /**
     * Sets the unitCost
     *
     * @param unitCost the newunitCost
     */
	public void setUnitCost(String unitCost) {
		this.unitCost = unitCost;
	}
}
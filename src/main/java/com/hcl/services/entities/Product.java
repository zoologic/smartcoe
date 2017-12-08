package com.hcl.services.entities;

import javax.persistence.*;
import java.util.*;

/**
* The class Product
*/
@Entity
//TODO Set the @Id annotation for the primary key field

public class Product {

	
	/** The categoryId .*/
	@Id
	private String categoryId;
	
	/** The descn .*/
	private String descn;
	
	/** The id .*/
	private String id;
	
	/** The image .*/
	private String image;
	
	/** The name .*/
	private String name;
	
	/** The productId .*/
	private String productId;
    
	 /**
     * Gets the categoryId
     *
     * @return the categoryId
     */
	public String getCategoryId() {
		return categoryId;
	}
	
	 /**
     * Sets the categoryId
     *
     * @param categoryId the newcategoryId
     */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	 /**
     * Gets the descn
     *
     * @return the descn
     */
	public String getDescn() {
		return descn;
	}
	
	 /**
     * Sets the descn
     *
     * @param descn the newdescn
     */
	public void setDescn(String descn) {
		this.descn = descn;
	}
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
}
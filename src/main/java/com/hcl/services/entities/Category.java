package com.hcl.services.entities;

import javax.persistence.*;
import java.util.*;

/**
* The class Category
*/
@Entity
//TODO Set the @Id annotation for the primary key field

public class Category {

	
	/** The categoryId .*/
	@Id
	private String categoryId;
	
	/** The descn .*/
	private String descn;
	
	/** The id .*/
	private String id;
	
	/** The name .*/
	private String name;
    
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
}
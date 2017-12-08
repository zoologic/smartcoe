package com.hcl.services.entities;

import javax.persistence.*;
import java.util.*;

/**
* The class Supplier
*/
@Entity
//TODO Set the @Id annotation for the primary key field

public class Supplier {

	
	/** The addr1 .*/
	private String addr1;
	
	/** The addr2 .*/
	private String addr2;
	
	/** The city .*/
	private String city;
	
	/** The id .*/
	@Id
	private String id;
	
	/** The name .*/
	private String name;
	
	/** The phone .*/
	private String phone;
	
	/** The state .*/
	private String state;
	
	/** The status .*/
	private String status;
	
	/** The supplierId .*/
	private String supplierId;
	
	/** The zip .*/
	private String zip;
    
	 /**
     * Gets the addr1
     *
     * @return the addr1
     */
	public String getAddr1() {
		return addr1;
	}
	
	 /**
     * Sets the addr1
     *
     * @param addr1 the newaddr1
     */
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	 /**
     * Gets the addr2
     *
     * @return the addr2
     */
	public String getAddr2() {
		return addr2;
	}
	
	 /**
     * Sets the addr2
     *
     * @param addr2 the newaddr2
     */
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	 /**
     * Gets the city
     *
     * @return the city
     */
	public String getCity() {
		return city;
	}
	
	 /**
     * Sets the city
     *
     * @param city the newcity
     */
	public void setCity(String city) {
		this.city = city;
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
	 /**
     * Gets the phone
     *
     * @return the phone
     */
	public String getPhone() {
		return phone;
	}
	
	 /**
     * Sets the phone
     *
     * @param phone the newphone
     */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	 /**
     * Gets the state
     *
     * @return the state
     */
	public String getState() {
		return state;
	}
	
	 /**
     * Sets the state
     *
     * @param state the newstate
     */
	public void setState(String state) {
		this.state = state;
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
     * Gets the zip
     *
     * @return the zip
     */
	public String getZip() {
		return zip;
	}
	
	 /**
     * Sets the zip
     *
     * @param zip the newzip
     */
	public void setZip(String zip) {
		this.zip = zip;
	}
}
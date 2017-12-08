package com.hcl.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import javax.transaction.Transactional;
import com.hcl.services.entities.*;
import com.hcl.services.repository.*;

/**
 * The Interface ISuppliersService.
 */
public interface ISuppliersService{

	/**
	 * getSuppliers.
	 *
     * @param supplierid the supplierid
	  * @return the List of Supplier
	 */
	List<Supplier> getSuppliers(String supplierid);
	
	/**
	 * updateSupplier.
	 *
     * @param supplier the supplier
	  * @return the Supplier
	 */
	Supplier updateSupplier(Supplier supplier);
	
	/**
	 * createSupplier.
	 *
     * @param supplier the supplier
	  * @return the Supplier
	 */
	Supplier createSupplier(Supplier supplier);
	
	/**
	 * deleteSuppliers.
	 *
     * @param supplierid the supplierid
	  * @return the List of Supplier
	 */
	List<Supplier> deleteSuppliers(String supplierid);
	
	/**
	 * getSupplier.
	 *
     * @param supplierid the supplierid
	  * @return the Supplier
	 */
	Supplier getSupplier(String supplierid);
	

}

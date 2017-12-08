package com.hcl.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import javax.transaction.Transactional;
import com.hcl.services.entities.*;
import com.hcl.services.repository.*;

/**
 * The Class SuppliersService.
 */
@Service
@Transactional
public class SuppliersService implements ISuppliersService {

	/** The supplierRepository. */
	@Autowired
	private SupplierRepository supplierRepository;
      
	/**
	 * getSuppliers.
	 *
     * @param supplierid the supplierid
	 * @return the List of Supplier
	 */
	@Override
	public List<Supplier> getSuppliers(String supplierid) {
		List<Supplier> list = new ArrayList<>();
if(supplierid != null && !supplierid.isEmpty()) { 
	list.add(supplierRepository.findOne(supplierid));
} else { 
	list.addAll((List<Supplier>)supplierRepository.findAll());
}return list;
	}
	
	/**
	 * updateSupplier.
	 *
     * @param supplier the supplier
	 * @return the Supplier
	 */
	@Override
	public Supplier updateSupplier(Supplier supplier) {
		return supplierRepository.save(supplier);
	}
	
	/**
	 * createSupplier.
	 *
     * @param supplier the supplier
	 * @return the Supplier
	 */
	@Override
	public Supplier createSupplier(Supplier supplier) {
		return supplierRepository.save(supplier);
	}
	
	/**
	 * deleteSuppliers.
	 *
     * @param supplierid the supplierid
	 * @return the List of Supplier
	 */
	@Override
	public List<Supplier> deleteSuppliers(String supplierid) {
		//TODO - Add logic to return deleted objects 
supplierRepository.delete(supplierid);return null;
	}
	
	/**
	 * getSupplier.
	 *
     * @param supplierid the supplierid
	 * @return the Supplier
	 */
	@Override
	public Supplier getSupplier(String supplierid) {
		return supplierRepository.findOne(supplierid);
	}
	
       
}
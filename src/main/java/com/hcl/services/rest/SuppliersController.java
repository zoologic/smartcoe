package com.hcl.services.rest;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.hcl.services.entities.*;
import com.hcl.services.service.*;

/**
* The class SuppliersController
*/
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class SuppliersController {

	/** The suppliersService. */
	@Autowired
	private ISuppliersService suppliersService;

	/**
	 *<b> Get all Suppliers or filtered by input supplierid</b>
	 *<p> 
	 *
     * @param supplierid the supplierid
	 * @return the List of Supplier
	 */
	@RequestMapping(value = "/suppliers", method=RequestMethod.GET , consumes={"application/json"} , produces={"application/json"})
	public List<Supplier> getSuppliers(@RequestParam(value="supplierid", required=false) String supplierid) {
		return suppliersService.getSuppliers(supplierid);
	}
	
	/**
	 *<b> Update Supplier</b>
	 *<p> 
	 *
     * @param supplier the supplier
	 * @return the Supplier
	 */
	@RequestMapping(value = "/suppliers", method=RequestMethod.PUT , consumes={"application/json"} , produces={"application/json"})
	public Supplier updateSupplier(@RequestBody(required=true) Supplier supplier) {
		return suppliersService.updateSupplier(supplier);
	}
	
	/**
	 *<b> Create Supplier</b>
	 *<p> 
	 *
     * @param supplier the supplier
	 * @return the Supplier
	 */
	@RequestMapping(value = "/suppliers", method=RequestMethod.POST , consumes={"application/json"} , produces={"application/json"})
	public Supplier createSupplier(@RequestBody(required=true) Supplier supplier) {
		return suppliersService.createSupplier(supplier);
	}
	
	/**
	 *<b> Delete all Suppliers or filtered by input supplierid</b>
	 *<p> 
	 *
     * @param supplierid the supplierid
	 * @return the List of Supplier
	 */
	@RequestMapping(value = "/suppliers", method=RequestMethod.DELETE , consumes={"application/json"} , produces={"application/json"})
	public List<Supplier> deleteSuppliers(@RequestParam(value="supplierid", required=false) String supplierid) {
		return suppliersService.deleteSuppliers(supplierid);
	}
	
	/**
	 *<b> getSupplier</b>
	 *<p> 
	 *
     * @param supplierid the supplierid
	 * @return the Supplier
	 */
	@RequestMapping(value = "/suppliers/{supplierid}", method=RequestMethod.GET , consumes={"application/json"} , produces={"application/json"})
	public Supplier getSupplier(@PathVariable(value="supplierid", required=true) String supplierid) {
		return suppliersService.getSupplier(supplierid);
	}
	

}
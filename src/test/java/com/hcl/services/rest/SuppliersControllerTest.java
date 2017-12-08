package com.hcl.services.rest;

import java.util.*;
import org.junit.*;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.web.servlet.*;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.test.context.junit4.*;
import org.springframework.test.web.servlet.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.http.MediaType;
import org.skyscreamer.jsonassert.JSONAssert;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.http.MediaType;
import java.io.File;
import com.hcl.services.entities.*;
import com.hcl.services.service.*;
import com.hcl.services.rest.*;

@RunWith(SpringRunner.class)
@WebMvcTest(value = SuppliersController.class, secure = false)
public class SuppliersControllerTest {

	@MockBean 
	private SuppliersService suppliersService;
	
	@Autowired
	private MockMvc mockMvc;
	

	@Test
	public void getSuppliersTest() throws Exception {
		List<Supplier> listObj = new ArrayList<>();
        String expected = "[{\"addr1\":\"Fish\", \"addr2\":\"Fish\", \"city\":\"Fish\", \"id\":\"Fish\", \"name\":\"Fish\", \"phone\":\"Fish\", \"state\":\"Fish\", \"status\":\"Fish\", \"supplierId\":\"Fish\", \"zip\":\"Fish\"}]";		
		Supplier supplier = new Supplier();
	    supplier.setAddr1("Fish"); 
	    supplier.setAddr2("Fish"); 
	    supplier.setCity("Fish"); 
	    supplier.setId("Fish"); 
	    supplier.setName("Fish"); 
	    supplier.setPhone("Fish"); 
	    supplier.setState("Fish"); 
	    supplier.setStatus("Fish"); 
	    supplier.setSupplierId("Fish"); 
	    supplier.setZip("Fish"); 
		listObj.add(supplier);
		Mockito.when(suppliersService.getSuppliers(Mockito.anyString())).thenReturn(listObj); 
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/suppliers?supplierid=fish")
		.contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,result.getResponse().getContentAsString(), false);
	}
	
	@Test
	public void updateSupplierTest() throws Exception {
   	    String expected = "{\"addr1\":\"Fish\", \"addr2\":\"Fish\", \"city\":\"Fish\", \"id\":\"Fish\", \"name\":\"Fish\", \"phone\":\"Fish\", \"state\":\"Fish\", \"status\":\"Fish\", \"supplierId\":\"Fish\", \"zip\":\"Fish\"}";		
		Supplier supplier = new Supplier();
	    supplier.setAddr1("Fish"); 
	    supplier.setAddr2("Fish"); 
	    supplier.setCity("Fish"); 
	    supplier.setId("Fish"); 
	    supplier.setName("Fish"); 
	    supplier.setPhone("Fish"); 
	    supplier.setState("Fish"); 
	    supplier.setStatus("Fish"); 
	    supplier.setSupplierId("Fish"); 
	    supplier.setZip("Fish"); 
		Mockito.when(suppliersService.updateSupplier(supplier)).thenReturn(supplier); 
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("./src/test/resources/test.json"),supplier);
		String jsonInString = mapper.writeValueAsString(supplier);
		jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(supplier);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.put("/suppliers")
		.accept(MediaType.APPLICATION_JSON).content(jsonInString).contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,jsonInString, false);
	}
	
	@Test
	public void createSupplierTest() throws Exception {
   	    String expected = "{\"addr1\":\"Fish\", \"addr2\":\"Fish\", \"city\":\"Fish\", \"id\":\"Fish\", \"name\":\"Fish\", \"phone\":\"Fish\", \"state\":\"Fish\", \"status\":\"Fish\", \"supplierId\":\"Fish\", \"zip\":\"Fish\"}";		
		Supplier supplier = new Supplier();
	    supplier.setAddr1("Fish"); 
	    supplier.setAddr2("Fish"); 
	    supplier.setCity("Fish"); 
	    supplier.setId("Fish"); 
	    supplier.setName("Fish"); 
	    supplier.setPhone("Fish"); 
	    supplier.setState("Fish"); 
	    supplier.setStatus("Fish"); 
	    supplier.setSupplierId("Fish"); 
	    supplier.setZip("Fish"); 
		Mockito.when(suppliersService.createSupplier(supplier)).thenReturn(supplier); 
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("./src/test/resources/test.json"),supplier);
		String jsonInString = mapper.writeValueAsString(supplier);
		jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(supplier);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/suppliers")
		.accept(MediaType.APPLICATION_JSON).content(jsonInString).contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,jsonInString, false);
	}
	
	@Test
	public void deleteSuppliersTest() throws Exception {
		List<Supplier> listObj = new ArrayList<>();
        String expected = "[{\"addr1\":\"Fish\", \"addr2\":\"Fish\", \"city\":\"Fish\", \"id\":\"Fish\", \"name\":\"Fish\", \"phone\":\"Fish\", \"state\":\"Fish\", \"status\":\"Fish\", \"supplierId\":\"Fish\", \"zip\":\"Fish\"}]";		
		Supplier supplier = new Supplier();
	    supplier.setAddr1("Fish"); 
	    supplier.setAddr2("Fish"); 
	    supplier.setCity("Fish"); 
	    supplier.setId("Fish"); 
	    supplier.setName("Fish"); 
	    supplier.setPhone("Fish"); 
	    supplier.setState("Fish"); 
	    supplier.setStatus("Fish"); 
	    supplier.setSupplierId("Fish"); 
	    supplier.setZip("Fish"); 
		listObj.add(supplier);
		Mockito.when(suppliersService.deleteSuppliers(Mockito.anyString())).thenReturn(listObj); 
		RequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/suppliers?supplierid=fish")
		.contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,result.getResponse().getContentAsString(), false);
	}
	
	@Test
	public void getSupplierTest() throws Exception {
   	    String expected = "{\"addr1\":\"Fish\", \"addr2\":\"Fish\", \"city\":\"Fish\", \"id\":\"Fish\", \"name\":\"Fish\", \"phone\":\"Fish\", \"state\":\"Fish\", \"status\":\"Fish\", \"supplierId\":\"Fish\", \"zip\":\"Fish\"}";		
		Supplier supplier = new Supplier();
	    supplier.setAddr1("Fish"); 
	    supplier.setAddr2("Fish"); 
	    supplier.setCity("Fish"); 
	    supplier.setId("Fish"); 
	    supplier.setName("Fish"); 
	    supplier.setPhone("Fish"); 
	    supplier.setState("Fish"); 
	    supplier.setStatus("Fish"); 
	    supplier.setSupplierId("Fish"); 
	    supplier.setZip("Fish"); 
		Mockito.when(suppliersService.getSupplier(Mockito.anyString())).thenReturn(supplier); 
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/suppliers/fish")
		.contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,result.getResponse().getContentAsString(), false);
	}
	

}
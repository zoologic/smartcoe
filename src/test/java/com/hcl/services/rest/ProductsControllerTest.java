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
@WebMvcTest(value = ProductsController.class, secure = false)
public class ProductsControllerTest {

	@MockBean 
	private ProductsService productsService;
	
	@Autowired
	private MockMvc mockMvc;
	

	@Test
	public void getProductsTest() throws Exception {
		List<Product> listObj = new ArrayList<>();
        String expected = "[{\"categoryId\":\"Fish\", \"descn\":\"Fish\", \"id\":\"Fish\", \"image\":\"Fish\", \"name\":\"Fish\", \"productId\":\"Fish\"}]";		
		Product product = new Product();
	    product.setCategoryId("Fish"); 
	    product.setDescn("Fish"); 
	    product.setId("Fish"); 
	    product.setImage("Fish"); 
	    product.setName("Fish"); 
	    product.setProductId("Fish"); 
		listObj.add(product);
		Mockito.when(productsService.getProducts(Mockito.anyString())).thenReturn(listObj); 
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/products?categoryid=fish")
		.contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,result.getResponse().getContentAsString(), false);
	}
	
	@Test
	public void updateProductTest() throws Exception {
   	    String expected = "{\"categoryId\":\"Fish\", \"descn\":\"Fish\", \"id\":\"Fish\", \"image\":\"Fish\", \"name\":\"Fish\", \"productId\":\"Fish\"}";		
		Product product = new Product();
	    product.setCategoryId("Fish"); 
	    product.setDescn("Fish"); 
	    product.setId("Fish"); 
	    product.setImage("Fish"); 
	    product.setName("Fish"); 
	    product.setProductId("Fish"); 
		Mockito.when(productsService.updateProduct(product)).thenReturn(product); 
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("./src/test/resources/test.json"),product);
		String jsonInString = mapper.writeValueAsString(product);
		jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(product);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.put("/products")
		.accept(MediaType.APPLICATION_JSON).content(jsonInString).contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,jsonInString, false);
	}
	
	@Test
	public void addProductTest() throws Exception {
   	    String expected = "{\"categoryId\":\"Fish\", \"descn\":\"Fish\", \"id\":\"Fish\", \"image\":\"Fish\", \"name\":\"Fish\", \"productId\":\"Fish\"}";		
		Product product = new Product();
	    product.setCategoryId("Fish"); 
	    product.setDescn("Fish"); 
	    product.setId("Fish"); 
	    product.setImage("Fish"); 
	    product.setName("Fish"); 
	    product.setProductId("Fish"); 
		Mockito.when(productsService.addProduct(product)).thenReturn(product); 
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("./src/test/resources/test.json"),product);
		String jsonInString = mapper.writeValueAsString(product);
		jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(product);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/products")
		.accept(MediaType.APPLICATION_JSON).content(jsonInString).contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,jsonInString, false);
	}
	
	@Test
	public void deleteProductsTest() throws Exception {
		List<Product> listObj = new ArrayList<>();
        String expected = "[{\"categoryId\":\"Fish\", \"descn\":\"Fish\", \"id\":\"Fish\", \"image\":\"Fish\", \"name\":\"Fish\", \"productId\":\"Fish\"}]";		
		Product product = new Product();
	    product.setCategoryId("Fish"); 
	    product.setDescn("Fish"); 
	    product.setId("Fish"); 
	    product.setImage("Fish"); 
	    product.setName("Fish"); 
	    product.setProductId("Fish"); 
		listObj.add(product);
		Mockito.when(productsService.deleteProducts(Mockito.anyString())).thenReturn(listObj); 
		RequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/products?productId=fish")
		.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,result.getResponse().getContentAsString(), false);
	}
	

}
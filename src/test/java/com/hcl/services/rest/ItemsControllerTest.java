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
@WebMvcTest(value = ItemsController.class, secure = false)
public class ItemsControllerTest {

	@MockBean 
	private ItemsService itemsService;
	
	@Autowired
	private MockMvc mockMvc;
	

	@Test
	public void getItemsTest() throws Exception {
		List<Item> listObj = new ArrayList<>();
        String expected = "[{\"id\":\"Fish\", \"image\":\"Fish\", \"itemId\":\"Fish\", \"listPrice\":\"Fish\", \"name\":\"Fish\", \"productId\":\"Fish\", \"status\":\"Fish\", \"supplierId\":\"Fish\", \"unitCost\":\"Fish\"}]";		
		Item item = new Item();
	    item.setId("Fish"); 
	    item.setImage("Fish"); 
	    item.setItemId("Fish"); 
	    item.setListPrice("Fish"); 
	    item.setName("Fish"); 
	    item.setProductId("Fish"); 
	    item.setStatus("Fish"); 
	    item.setSupplierId("Fish"); 
	    item.setUnitCost("Fish"); 
		listObj.add(item);
		Mockito.when(itemsService.getItems(Mockito.anyString(), Mockito.anyString())).thenReturn(listObj); 
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/items?productid=fish& supplierid=fish")
		.contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,result.getResponse().getContentAsString(), false);
	}
	
	@Test
	public void updateItemTest() throws Exception {
   	    String expected = "{\"id\":\"Fish\", \"image\":\"Fish\", \"itemId\":\"Fish\", \"listPrice\":\"Fish\", \"name\":\"Fish\", \"productId\":\"Fish\", \"status\":\"Fish\", \"supplierId\":\"Fish\", \"unitCost\":\"Fish\"}";		
		Item item = new Item();
	    item.setId("Fish"); 
	    item.setImage("Fish"); 
	    item.setItemId("Fish"); 
	    item.setListPrice("Fish"); 
	    item.setName("Fish"); 
	    item.setProductId("Fish"); 
	    item.setStatus("Fish"); 
	    item.setSupplierId("Fish"); 
	    item.setUnitCost("Fish"); 
		Mockito.when(itemsService.updateItem(item)).thenReturn(item); 
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("./src/test/resources/test.json"),item);
		String jsonInString = mapper.writeValueAsString(item);
		jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(item);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.put("/items")
		.accept(MediaType.APPLICATION_JSON).content(jsonInString).contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,jsonInString, false);
	}
	
	@Test
	public void addItemTest() throws Exception {
   	    String expected = "{\"id\":\"Fish\", \"image\":\"Fish\", \"itemId\":\"Fish\", \"listPrice\":\"Fish\", \"name\":\"Fish\", \"productId\":\"Fish\", \"status\":\"Fish\", \"supplierId\":\"Fish\", \"unitCost\":\"Fish\"}";		
		Item item = new Item();
	    item.setId("Fish"); 
	    item.setImage("Fish"); 
	    item.setItemId("Fish"); 
	    item.setListPrice("Fish"); 
	    item.setName("Fish"); 
	    item.setProductId("Fish"); 
	    item.setStatus("Fish"); 
	    item.setSupplierId("Fish"); 
	    item.setUnitCost("Fish"); 
		Mockito.when(itemsService.addItem(item)).thenReturn(item); 
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("./src/test/resources/test.json"),item);
		String jsonInString = mapper.writeValueAsString(item);
		jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(item);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/items")
		.accept(MediaType.APPLICATION_JSON).content(jsonInString).contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,jsonInString, false);
	}
	
	@Test
	public void deleteItemsTest() throws Exception {
		List<Item> listObj = new ArrayList<>();
        String expected = "[{\"id\":\"Fish\", \"image\":\"Fish\", \"itemId\":\"Fish\", \"listPrice\":\"Fish\", \"name\":\"Fish\", \"productId\":\"Fish\", \"status\":\"Fish\", \"supplierId\":\"Fish\", \"unitCost\":\"Fish\"}]";		
		Item item = new Item();
	    item.setId("Fish"); 
	    item.setImage("Fish"); 
	    item.setItemId("Fish"); 
	    item.setListPrice("Fish"); 
	    item.setName("Fish"); 
	    item.setProductId("Fish"); 
	    item.setStatus("Fish"); 
	    item.setSupplierId("Fish"); 
	    item.setUnitCost("Fish"); 
		listObj.add(item);
		Mockito.when(itemsService.deleteItems(Mockito.anyString(), Mockito.anyString(), Mockito.anyString())).thenReturn(listObj); 
		RequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/items?itemid=fish& productid=fish& supplierid=fish")
		.contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,result.getResponse().getContentAsString(), false);
	}
	
	@Test
	public void getItemBySupplierIdTest() throws Exception {
		List<Item> listObj = new ArrayList<>();
        String expected = "[{\"id\":\"Fish\", \"image\":\"Fish\", \"itemId\":\"Fish\", \"listPrice\":\"Fish\", \"name\":\"Fish\", \"productId\":\"Fish\", \"status\":\"Fish\", \"supplierId\":\"Fish\", \"unitCost\":\"Fish\"}]";		
		Item item = new Item();
	    item.setId("Fish"); 
	    item.setImage("Fish"); 
	    item.setItemId("Fish"); 
	    item.setListPrice("Fish"); 
	    item.setName("Fish"); 
	    item.setProductId("Fish"); 
	    item.setStatus("Fish"); 
	    item.setSupplierId("Fish"); 
	    item.setUnitCost("Fish"); 
		listObj.add(item);
		Mockito.when(itemsService.getItemBySupplierId(Mockito.anyString(), Mockito.anyString())).thenReturn(listObj); 
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/items/fish?productid= fish")
		.contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,result.getResponse().getContentAsString(), false);
	}
	

}
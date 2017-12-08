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
@WebMvcTest(value = InventoryController.class, secure = false)
public class InventoryControllerTest {

	@MockBean 
	private InventoryService inventoryService;
	
	@Autowired
	private MockMvc mockMvc;
	

	@Test
	public void getInventoriesTest() throws Exception {
		List<Inventory> listObj = new ArrayList<>();
        String expected = "[{\"id\":\"Fish\", \"itemId\":\"Fish\", \"qty\":5}]";		
		Inventory inventory = new Inventory();
	    inventory.setId("Fish"); 
	    inventory.setItemId("Fish"); 
	    inventory.setQty(5); 
		listObj.add(inventory);
		Mockito.when(inventoryService.getInventories(Mockito.anyString())).thenReturn(listObj); 
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/inventory?itemid=fish")
		.contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,result.getResponse().getContentAsString(), false);
	}
	
	@Test
	public void addToInventoryTest() throws Exception {
   	    String expected = "{\"id\":\"Fish\", \"itemId\":\"Fish\", \"qty\":5}";		
		Inventory inventory = new Inventory();
	    inventory.setId("Fish"); 
	    inventory.setItemId("Fish"); 
	    inventory.setQty(5); 
		Mockito.when(inventoryService.addToInventory(inventory)).thenReturn(inventory); 
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("./src/test/resources/test.json"),inventory);
		String jsonInString = mapper.writeValueAsString(inventory);
		jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(inventory);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/inventory")
		.accept(MediaType.APPLICATION_JSON).content(jsonInString).contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,jsonInString, false);
	}
	
	@Test
	public void deleteInventoryTest() throws Exception {
		List<Inventory> listObj = new ArrayList<>();
        String expected = "[{\"id\":\"Fish\", \"itemId\":\"Fish\", \"qty\":5}]";		
		Inventory inventory = new Inventory();
	    inventory.setId("Fish"); 
	    inventory.setItemId("Fish"); 
	    inventory.setQty(5); 
		listObj.add(inventory);
		Mockito.when(inventoryService.deleteInventory(Mockito.anyString())).thenReturn(listObj); 
		RequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/inventory?itemid=fish")
		.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,result.getResponse().getContentAsString(), false);
	}
	
	@Test
	public void getInventoryTest() throws Exception {
   	    String expected = "{\"id\":\"Fish\", \"itemId\":\"Fish\", \"qty\":5}";		
		Inventory inventory = new Inventory();
	    inventory.setId("Fish"); 
	    inventory.setItemId("Fish"); 
	    inventory.setQty(5); 
		Mockito.when(inventoryService.getInventory(Mockito.anyString())).thenReturn(inventory); 
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/inventory/fish")
		.contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,result.getResponse().getContentAsString(), false);
	}
	

}
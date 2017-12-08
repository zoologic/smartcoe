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
@WebMvcTest(value = CategoriesController.class, secure = false)
public class CategoriesControllerTest {

	@MockBean 
	private CategoriesService categoriesService;
	
	@Autowired
	private MockMvc mockMvc;
	

	@Test
	public void getCategoriesTest() throws Exception {
		List<Category> listObj = new ArrayList<>();
        String expected = "[{\"categoryId\":\"Fish\", \"descn\":\"Fish\", \"id\":\"Fish\", \"name\":\"Fish\"}]";		
		Category category = new Category();
	    category.setCategoryId("Fish"); 
	    category.setDescn("Fish"); 
	    category.setId("Fish"); 
	    category.setName("Fish"); 
		listObj.add(category);
		Mockito.when(categoriesService.getCategories(Mockito.anyString())).thenReturn(listObj); 
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/categories?categoryId=fish")
		.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,result.getResponse().getContentAsString(), false);
	}
	
	@Test
	public void updateCategoryTest() throws Exception {
   	    String expected = "{\"categoryId\":\"Fish\", \"descn\":\"Fish\", \"id\":\"Fish\", \"name\":\"Fish\"}";		
		Category category = new Category();
	    category.setCategoryId("Fish"); 
	    category.setDescn("Fish"); 
	    category.setId("Fish"); 
	    category.setName("Fish"); 
		Mockito.when(categoriesService.updateCategory(category)).thenReturn(category); 
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("./src/test/resources/test.json"),category);
		String jsonInString = mapper.writeValueAsString(category);
		jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(category);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.put("/categories")
		.accept(MediaType.APPLICATION_JSON).content(jsonInString).contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,jsonInString, false);
	}
	
	@Test
	public void createCategoryTest() throws Exception {
   	    String expected = "{\"categoryId\":\"Fish\", \"descn\":\"Fish\", \"id\":\"Fish\", \"name\":\"Fish\"}";		
		Category category = new Category();
	    category.setCategoryId("Fish"); 
	    category.setDescn("Fish"); 
	    category.setId("Fish"); 
	    category.setName("Fish"); 
		Mockito.when(categoriesService.createCategory(category)).thenReturn(category); 
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("./src/test/resources/test.json"),category);
		String jsonInString = mapper.writeValueAsString(category);
		jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(category);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/categories")
		.accept(MediaType.APPLICATION_JSON).content(jsonInString).contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,jsonInString, false);
	}
	
	@Test
	public void deleteCategoriesTest() throws Exception {
		List<Category> listObj = new ArrayList<>();
        String expected = "[{\"categoryId\":\"Fish\", \"descn\":\"Fish\", \"id\":\"Fish\", \"name\":\"Fish\"}]";		
		Category category = new Category();
	    category.setCategoryId("Fish"); 
	    category.setDescn("Fish"); 
	    category.setId("Fish"); 
	    category.setName("Fish"); 
		listObj.add(category);
		Mockito.when(categoriesService.deleteCategories(Mockito.anyString())).thenReturn(listObj); 
		RequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/categories?categoryId=fish")
		.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,result.getResponse().getContentAsString(), false);
	}
	
	@Test
	public void getCategoryTest() throws Exception {
   	    String expected = "{\"categoryId\":\"Fish\", \"descn\":\"Fish\", \"id\":\"Fish\", \"name\":\"Fish\"}";		
		Category category = new Category();
	    category.setCategoryId("Fish"); 
	    category.setDescn("Fish"); 
	    category.setId("Fish"); 
	    category.setName("Fish"); 
		Mockito.when(categoriesService.getCategory(Mockito.anyString())).thenReturn(category); 
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/categories/fish")
		.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,result.getResponse().getContentAsString(), false);
	}
	
	@Test
	public void deleteCategoryTest() throws Exception {
   	    String expected = "{\"categoryId\":\"Fish\", \"descn\":\"Fish\", \"id\":\"Fish\", \"name\":\"Fish\"}";		
		Category category = new Category();
	    category.setCategoryId("Fish"); 
	    category.setDescn("Fish"); 
	    category.setId("Fish"); 
	    category.setName("Fish"); 
		Mockito.when(categoriesService.deleteCategory(Mockito.anyString())).thenReturn(category); 
		RequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/categories/fish")
		.contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,result.getResponse().getContentAsString(), false);
	}
	

}
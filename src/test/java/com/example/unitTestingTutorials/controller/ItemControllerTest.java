package com.example.unitTestingTutorials.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.unitTestingTutorials.controller.ItemController;
import com.example.unitTestingTutorials.model.Item;
import com.example.unitTestingTutorials.service.ItemBusinessService;

@RunWith(SpringRunner.class)
@WebMvcTest(ItemController.class)
public class ItemControllerTest {
    
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ItemBusinessService itemBusinessService;
	
	@Test
	public void retreiveAllItems() throws Exception {
		
		when(itemBusinessService.retreiveAllItems()).thenReturn(
				Arrays.asList(new Item(2,"Item2",10,10),
						      new Item(3,"Item3",20,20)));
		
		RequestBuilder request = MockMvcRequestBuilders
				                  .get("/all-items-from-database")
				                 .accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request).andExpect(status().isOk())
				           .andExpect(content().json("[{id:2,name:Item2,price:10},{id:3,name:Item3,price:20}]"))
				           .andReturn();
		System.out.println(result);
			
	}
	
	@Test
	public void testItemBusinessService() throws Exception {
		
		when(itemBusinessService.retriveHardcodedItem()).thenReturn(new Item(2,"Item2",10,10));
		
		RequestBuilder request = MockMvcRequestBuilders
				                  .get("/item-from-business-service")
				                 .accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request).andExpect(status().isOk())
				           .andExpect(content().json("{id:2,name:Item2,price:10}"))
				           .andReturn();
		System.out.println(result);
			
	}
	
	
}

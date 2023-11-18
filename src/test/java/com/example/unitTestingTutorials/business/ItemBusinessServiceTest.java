package com.example.unitTestingTutorials.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.unitTestingTutorials.model.Item;
import com.example.unitTestingTutorials.repo.ItemRepository;
import com.example.unitTestingTutorials.service.ItemBusinessService;


@ExtendWith(MockitoExtension.class)
public class ItemBusinessServiceTest {
	
	@Mock
	private ItemRepository itemrRepository;	
	
	@InjectMocks
	private ItemBusinessService businessServices;
	
	
	@Test
	public void businessretreiveAllItemsTest() {
		when(itemrRepository.findAll()).thenReturn(
				Arrays.asList(new Item(2,"Item2",10,10),
						      new Item(3,"Item3",20,20)));
		
		List<Item> items = businessServices.retreiveAllItems();
		assertEquals(100,items.get(0).getValue());
		assertEquals(400,items.get(1).getValue());
		
		
	}
}

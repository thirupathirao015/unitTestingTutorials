package com.example.unitTestingTutorials.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unitTestingTutorials.model.Item;
import com.example.unitTestingTutorials.service.ItemBusinessService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemBusinessService businessServices;
	
	@GetMapping("/item-from-business-service")
	public Item getItemBusinessService() {
		Item item = businessServices.retriveHardcodedItem();
		return item;		
	}
	
	@GetMapping("/all-items-from-database")
	public List<Item> retreiveAllItems(){
		return businessServices.retreiveAllItems();
	}
	
}

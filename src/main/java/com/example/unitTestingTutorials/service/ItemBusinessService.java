package com.example.unitTestingTutorials.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.unitTestingTutorials.model.Item;
import com.example.unitTestingTutorials.repo.ItemRepository;

@Service
//@Component
public class ItemBusinessService {

	@Autowired
	private ItemRepository itemRepository;
	
	public Item retriveHardcodedItem() {
		return new Item(1,"Ball",10,100);
	}
	
	public List<Item> retreiveAllItems(){
		List<Item> items = itemRepository.findAll();
		for(Item item:items) {
			item.setValue((int) (item.getPrice()*item.getQuantity()));
		}
		return itemRepository.findAll();
	}
}

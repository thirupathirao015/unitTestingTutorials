package com.example.unitTestingTutorials.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.unitTestingTutorials.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}

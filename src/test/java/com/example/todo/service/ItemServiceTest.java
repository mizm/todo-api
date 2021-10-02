package com.example.todo.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.todo.service.dto.ItemResponse;

@SpringBootTest
class ItemServiceTest {

	@Autowired
	private ItemService itemService;

	@Test
	void findAllTest() {

		List<ItemResponse> all = itemService.findAll();
		for (ItemResponse itemResponse : all) {
			System.out.println("itemResponse = " + itemResponse);
		}
	}

}
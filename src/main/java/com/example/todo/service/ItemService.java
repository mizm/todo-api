package com.example.todo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.todo.domain.Item;
import com.example.todo.repository.ItemRepository;
import com.example.todo.service.dto.ItemResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemService {

	private final ItemRepository itemRepository;

	public ItemResponse create(Item item) {
		return new ItemResponse(itemRepository.save(item));
	}

	public List<ItemResponse> findAll() {
		return itemRepository.findAll().stream()
			.map(ItemResponse::new)
			.collect(Collectors.toList());
	}
}

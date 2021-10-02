package com.example.todo.service.dto;

import com.example.todo.domain.Item;
import com.example.todo.domain.ItemStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemResponse {
	private Long id;
	private String title;

	public ItemResponse(Item item) {
		this.id = item.getId();
		this.title = item.getTitle();
	}
}

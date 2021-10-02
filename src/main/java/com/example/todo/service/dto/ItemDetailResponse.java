package com.example.todo.service.dto;

import com.example.todo.domain.Item;
import com.example.todo.domain.ItemStatus;

public class ItemDetailResponse {
	private Long id;
	private String title;
	private String content;
	private ItemStatus status;

	public ItemDetailResponse(Item item) {
		this.id = item.getId();
		this.title = item.getTitle();
		this.content = item.getContent();
		this.status = item.getStatus();
	}
}

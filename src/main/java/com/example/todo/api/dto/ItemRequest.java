package com.example.todo.api.dto;

import com.example.todo.domain.ItemStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemRequest {
	private String title;
	private String content;
	private ItemStatus status;
}

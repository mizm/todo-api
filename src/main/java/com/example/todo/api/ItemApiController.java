package com.example.todo.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.api.dto.ApiResult;
import com.example.todo.api.dto.ItemRequest;
import com.example.todo.domain.Item;
import com.example.todo.service.ItemService;
import com.example.todo.service.dto.ItemResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/items")
public class ItemApiController {

	private final ItemService itemService;

	@PostMapping
	public ApiResult<ItemResponse> create(@RequestBody ItemRequest itemRequest) {
		Item item = Item.createItem(itemRequest.getTitle(), itemRequest.getContent(), itemRequest.getStatus());
		return ApiResult.succeed(itemService.create(item));
	}

	@GetMapping
	public ApiResult<List<ItemResponse>> findAll() {
		return ApiResult.succeed(itemService.findAll());
	}
}

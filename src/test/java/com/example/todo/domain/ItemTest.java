package com.example.todo.domain;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class ItemTest {

	@Test
	@DisplayName("제목이 비어있을 경우 예외 발생")
	void titleIsNotBlank() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> Item.createItem("", "test"));
		Assertions.assertThrows(IllegalArgumentException.class, () -> Item.createItem(null, "test"));
	}

	@Test
	@DisplayName("내용이 비어있을 경우 예외 발생")
	void contentIsNotBlank() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> Item.createItem("title", ""));
		Assertions.assertThrows(IllegalArgumentException.class, () -> Item.createItem("title", null));
	}

	@Test
	@DisplayName("정상 생성 케이스 테스트")
	void createItem() {
		String title = "title";
		String content = "content";

		Item item = Item.createItem(title, content);

		Assertions.assertEquals(item.getTitle(), title);
		Assertions.assertEquals(item.getContent(), content);
		Assertions.assertEquals(item.getStatus(), ItemStatus.ready);
	}

}
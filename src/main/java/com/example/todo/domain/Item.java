package com.example.todo.domain;

import static com.google.common.base.Preconditions.*;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.logging.log4j.util.Strings;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "items")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Item {

	@Id
	@GeneratedValue
	private Long id;

	private String title;

	private String content;

	@Enumerated(EnumType.STRING)
	private ItemStatus status;

	private Item(String title, String content, ItemStatus status) {
		this.title = title;
		this.content = content;
		this.status = status;
	}

	public static Item createItem(String title, String content) {
		return createItem(title, content, ItemStatus.ready);
	}

	public static Item createItem(String title, String content, ItemStatus status) {
		checkArgument(!Strings.isEmpty(title), "Title cannot be empty.");
		checkArgument(!Strings.isEmpty(content), "Content cannot be empty.");
		if(Objects.isNull(status)) {
			status = ItemStatus.ready;
		}
		return new Item(title, content, status);
	}
}

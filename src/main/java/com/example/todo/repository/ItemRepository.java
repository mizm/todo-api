package com.example.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todo.domain.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}

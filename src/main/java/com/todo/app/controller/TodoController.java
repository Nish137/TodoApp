package com.todo.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

	
	@GetMapping("/todos")
	public String sayTodo() {
		return "Hello Todos";
	}
}

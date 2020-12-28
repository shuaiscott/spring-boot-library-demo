package com.scott.library.api.demo.model;

import lombok.Getter;

@Getter
public class Book {
    
    private final long id;
	private final String content;

	public Book(long id, String content) {
		this.id = id;
		this.content = content;
	}

}

package com.scott.library.api.demo.dto;

import lombok.Getter;

@Getter
public class BookDto {
    
    private final long id;
	private final String content;

	public BookDto(long id, String content) {
		this.id = id;
		this.content = content;
	}

}

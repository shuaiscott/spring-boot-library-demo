package com.scott.library.api.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.scott.library.api.demo.dto.BookDto;
import com.scott.library.api.demo.model.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.modelmapper.ModelMapper;


@RestController
public class BookController {
	
	@Autowired
   	private ModelMapper modelMapper;

    private static final String TEMPLATE = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/books")
	public List<Book> greeting() {
		return Arrays.asList(new Book(counter.incrementAndGet(), String.format(TEMPLATE, "test")));
    }
	
	private BookDto convertBookToDto(Book book) {
		return modelMapper.map(book, BookDto.class);
	}
}



package com.akash.bookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.akash.bookStore.service.MyBookListService;

@Controller
public class MyBookListController {
	
	@Autowired
	private MyBookListService myBookService;

	
	@RequestMapping("/deleteMyList/{id}")
	public String getMyList(@PathVariable("id") int id) {
		myBookService.deleteById(id);
		return "redirect:/my_books";
	}
}
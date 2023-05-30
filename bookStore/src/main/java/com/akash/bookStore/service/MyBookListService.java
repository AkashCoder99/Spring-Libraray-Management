package com.akash.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.bookStore.entity.MyBookList;
import com.akash.bookStore.repository.MyBookRepository;

@Service
public class MyBookListService {
	
	@Autowired
	private MyBookRepository bRepo;
	
	public List<MyBookList> getAllBooks(){
		return bRepo.findAll();
	}
	
	public void saveMyBook(MyBookList b) {
		bRepo.save(b);
	}
	
	public void deleteById(int id){
		bRepo.deleteById(id);
	}
}

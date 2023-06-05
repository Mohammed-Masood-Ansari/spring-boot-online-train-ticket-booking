package com.irctc.onlinetrainticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.onlinetrainticketbooking.dto.BookTrain;
import com.irctc.onlinetrainticketbooking.response.ResponseStructure;
import com.irctc.onlinetrainticketbooking.service.BookTrainService;

@RequestMapping("/bookTrain")
@RestController
public class BookTrainController {

	@Autowired
	private BookTrainService bookTrainService;
	
	/*
	 *  bookTrainMethod 
	 *
	 */
	
	@PostMapping("/bookTrainTicket/{trainSource}/{trainDestination}/{trainNumber}")
	public ResponseStructure<BookTrain> bookTrain(@RequestBody BookTrain bookTrain,
			@PathVariable String trainSource,@PathVariable String trainDestination, @PathVariable int trainNumber) {
		
		return bookTrainService.bookTrain(bookTrain, trainSource, trainDestination, trainNumber);
	}
}

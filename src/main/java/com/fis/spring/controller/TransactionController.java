package com.fis.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fis.spring.Dto.AccountDto;
import com.fis.spring.service.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	@Autowired
	private TransactionService transactionService;
	
	public ResponseEntity<?> chuyenTien(@RequestBody AccountDto accountDto){
		return  ResponseEntity.ok(transactionService.chuyenTien(accountDto));
	}
	

}

package com.fis.spring.service;

import org.springframework.stereotype.Component;

import com.fis.spring.Dto.AccountDto;
import com.fis.spring.entity.Account;
import com.fis.spring.entity.Transaction;

@Component
public interface TransactionService {
	
	Transaction chuyenTien(AccountDto accountDto);
}

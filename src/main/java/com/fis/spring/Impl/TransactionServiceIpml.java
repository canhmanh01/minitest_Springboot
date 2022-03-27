package com.fis.spring.Impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.spring.Dto.AccountDto;
import com.fis.spring.entity.Account;
import com.fis.spring.entity.Transaction;
import com.fis.spring.repository.AccountRepo;
import com.fis.spring.repository.TransactionRepo;
import com.fis.spring.service.TransactionService;



@Service
public class TransactionServiceIpml implements TransactionService {
	@Autowired
	private TransactionRepo transactionRepo;
	private AccountRepo accountRepo;
	@Override
	public Transaction chuyenTien(AccountDto accountDto) {
		
		Account fromAccount= accountRepo.findById(accountDto.getFromAccountId()).orElse(null);
		Account toAccount= accountRepo.findById(accountDto.getToAccountId()).orElse(null);			
		String errorReason=null;
		
		Integer status = null;
		Date date=new Date();
		Transaction tr = new Transaction(null, date, fromAccount, accountDto.getToAccount(), accountDto.getAmount(), status, errorReason, errorReason);
		
			
		if(status==1) {
			fromAccount.setBalance(fromAccount.getBalance()-accountDto.getAmount());
			toAccount.setBalance(toAccount.getBalance()+accountDto.getAmount());
			accountRepo.save(fromAccount);
			accountRepo.save(toAccount);
			transactionRepo.save(tr);
		}
		else {
			transactionRepo.save(tr);
		}
		return tr;
	}



	

}

package com.fis.spring.Impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.spring.entity.Account;
import com.fis.spring.entity.Transaction;
import com.fis.spring.repository.AccountRepo;
import com.fis.spring.repository.TransactionRepo;
import com.fis.spring.service.TransactionService;


@Service
public class TransactionServiceIpml implements TransactionService {
	@Autowired
	TransactionRepo transactionRepo;
	AccountRepo accountRepo;
	@Override
	public Transaction chuyenTien(Account fromAccount, Account toAccount, Double amount) {
		// TODO Auto-generated method stub
		Transaction tr = new Transaction(null, null, fromAccount, toAccount, amount, null, null, null);
		fromAccount.setBalance(fromAccount.getBalance()- amount);
		
		toAccount.setBalance(toAccount.getBalance()-amount);
		Date date=new Date();
		Transaction transaction=new Transaction(null, date, fromAccount, toAccount, amount, 1, null, null);
		accountRepo.save(fromAccount);
		accountRepo.save(toAccount);
		transactionRepo.save(tr);
		return tr;
	}


	

}

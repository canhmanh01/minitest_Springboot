package com.fis.spring.Dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

import com.fis.spring.entity.Account;
import com.fis.spring.entity.Transaction;

import lombok.Data;

@Data
@Entity
public class AccountDto extends Transaction {
	
	
	
	public AccountDto(Long id, Date transactionDate, Account fronmAccount, Account toAccount, Double amount,
			Integer status, String content, String errorReason) {
		super(id, transactionDate, fronmAccount, toAccount, amount, status, content, errorReason);
		// TODO Auto-generated constructor stub
	}

	private String accountNumber;
	private String accountName;
	private Double balance;
	private int status;
	private Account fronmAccount;
	private Account toAccount;
	
	List<Transaction> listtran = new ArrayList<>();


}

package com.fis.spring.Dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

import com.fis.spring.entity.Account;
import com.fis.spring.entity.Transaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto extends Transaction  {
	
	
	
	private Long fromAccountId;
	private Long toAccountId;
	private Double amount;
	private String content;
	

	public AccountDto(Long id, Date transactionDate, Account fronmAccount, Long toAccount, Double amount,
			Integer status, String content, String errorReason) {
		super(id, transactionDate, fronmAccount, toAccount, amount, status, content, errorReason);
		// TODO Auto-generated constructor stub
	}
	public Account getFromAccountId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Account getToAccountId() {
		// TODO Auto-generated method stub
		return null;
	}


}

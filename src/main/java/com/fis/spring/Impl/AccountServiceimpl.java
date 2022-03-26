package com.fis.spring.Impl;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.fis.spring.entity.Account;
import com.fis.spring.repository.AccountRepo;
import com.fis.spring.service.AccountService;

@Service
public class AccountServiceimpl implements AccountService {

	@Autowired
	private AccountRepo accountRepo;

	@Override
	public Account save(Account account) {
		// validate account phair ton tai moi cho update
		// TODO Auto-generated method stub

		return accountRepo.save(account);
	}

	@Override
	public Account update(Account account) {

		account = accountRepo.save(account);
		return account;
	}

	@Override
	public void deleteById(Long accountId) {

		accountRepo.deleteById(accountId);
		// TODO Auto-generated method stub

	}

	@Override
	public Account getById(Long accountId) {

		return accountRepo.getById(accountId);
	}

}

package com.fis.spring.Impl;



import java.util.List;

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
		List<Account> list = accountRepo.findByAccountNumber(account.getAccountNumber());
		
		if (list.size()!=0) {
			
			return null;
				
		}else if (account.getAccountNumber().length()!=12) {
			
			return null;
			
			
		}else if (account.getAccountName().length()<=5||account.getAccountName().length()>=100) {
			
		return null;
		
			
		}
		account.setBalance(100000.0);
		account.setStatus(1);
		
		// validate account phair ton tai moi cho update
		// TODO Auto-generated method stub
		//đầu tiên ta lấy danh sách account trong db sau đó kiểm tra 

		return accountRepo.save(account);
	}

	@Override
	public Account update(Account account) {
		
		Account ac = accountRepo.findById(account.getId()).orElse(account);
		ac.setAccountName(ac.getAccountName());
		ac.setAccountNumber(ac.getAccountNumber());
		ac.setBalance(ac.getBalance());
		ac.setStatus(ac.getStatus());

		
		return accountRepo.save(account);
	}

	@Override
	public String deleteById(Long accountId) {
		if (accountRepo.findById(accountId)!=null) {
			
			accountRepo.deleteById(accountId);
			
		}
		return "delete account unsuccessful";
		
		// TODO Auto-generated method stub

	}

	@Override
	public Account getById(Long accountId) {

		return accountRepo.getById(accountId);
	}

	@Override
	public List<Account> findAllAccounts() {
		// lấy ra hết tất cả các acount trong db
		return (List<Account>) accountRepo.findAll();
	}

}

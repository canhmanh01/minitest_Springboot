package com.fis.spring.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fis.spring.entity.Account;

@Component
public interface AccountService {
	Account save(Account account);
    Account update(Account account);
    String deleteById(Long accountId);
    Account getById(Long accountId);
    List<Account> findAllAccounts();

}

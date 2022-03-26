package com.fis.spring.service;

import org.springframework.stereotype.Component;

import com.fis.spring.entity.Account;

@Component
public interface AccountService {
	Account save(Account account);
    Account update(Account account);
    void deleteById(Long accountId);
    Account getById(Long accountId);

}

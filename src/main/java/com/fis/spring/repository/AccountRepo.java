package com.fis.spring.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fis.spring.entity.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {

	List<Account> findByAccountNumber(String accountNumber);

	Optional<Account> findById(Account toAccount);

}

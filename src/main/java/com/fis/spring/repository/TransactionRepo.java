package com.fis.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fis.spring.entity.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Long> {

	

}

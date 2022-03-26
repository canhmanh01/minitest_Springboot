package com.fis.spring.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity

@Table(name = "transaction")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date transactionDate;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fronmAccount", referencedColumnName = "id")
	private Account fronmAccount;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "toAccount", referencedColumnName = "id")
	private Account toAccount;
	private Double amount;
	private Integer status;
	private String content;
	private String errorReason;
	
	public Transaction(Long id, Date transactionDate, Account fronmAccount, Account toAccount, Double amount,
			Integer status, String content, String errorReason) {
		super();
		this.id = id;
		this.transactionDate = transactionDate;
		this.fronmAccount = fronmAccount;
		this.toAccount = toAccount;
		this.amount = amount;
		this.status = status;
		this.content = content;
		this.errorReason = errorReason;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Account getFronmAccount() {
		return fronmAccount;
	}

	public void setFronmAccount(Account fronmAccount) {
		this.fronmAccount = fronmAccount;
	}

	public Account getToAccount() {
		return toAccount;
	}

	public void setToAccount(Account toAccount) {
		this.toAccount = toAccount;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getErrorReason() {
		return errorReason;
	}

	public void setErrorReason(String errorReason) {
		this.errorReason = errorReason;
	}

	
	
}

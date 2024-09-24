package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bank {
	
	@Id
	private long accountno;
	private String name;
	private String psw;
	private double amount;
	private String address;
	private long mobileno;	
	private String status="active";
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(long accountno, String name, String psw, double amount, String address, long mobileno, String status) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.psw = psw;
		this.amount = amount;
		this.address = address;
		this.mobileno = mobileno;
		this.status = status;
	}
	public long getAccountno() {
		return accountno;
	}
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
		
	}
	@Override
	public String toString() {
		return "Bank [accountno=" + accountno + ", name=" + name + ", psw=" + psw + ", amount=" + amount + ", address="
				+ address + ", mobileno=" + mobileno + ", status=" + status + "]";
	}
	
	

	
	
	
	
	

}

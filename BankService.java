package com.web.service;

import com.web.model.Bank;


public interface BankService {
	
	
		public Bank saveBank(Bank bank);
		public Bank checkBalance(Bank bank);
		public Bank depositAmount(Bank bank);
		public Bank withdrawAmount(Bank bank);
		public Bank transferAmount(Bank bank,long taccount);
		public Bank closeAccount(Bank bank);
		public double getBalance(Bank bank);
		
		

}

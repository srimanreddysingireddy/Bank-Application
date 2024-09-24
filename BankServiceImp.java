package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Bank;
import com.web.repository.BankRepo;
@Service
public class BankServiceImp implements BankService {
    @Autowired 
    private BankRepo repo;
	@Override
	public Bank saveBank(Bank bank) {
		
		return repo.save(bank);
	}

	@Override
	public Bank checkBalance(Bank bank)
	{
		Bank bal=repo.findById(bank.getAccountno()).get();
		if((bal.getAccountno()==bank.getAccountno()) && (bal.getName().equals(bal.getName())  && (bal.getPsw().equals(bank.getPsw()))))
		     {
			    return  bal;
		     }
		else 
			return null;
	}

	@Override
	public Bank depositAmount(Bank bank) 
	{
		Bank deposit=repo.findById(bank.getAccountno()).get();
		double totalamt=0.0;
		if((deposit.getAccountno()==bank.getAccountno()) && (deposit.getName().equals(deposit.getName())  && (deposit.getPsw().equals(bank.getPsw()))))
		     {
			    totalamt=deposit.getAmount()+bank.getAmount();
			    
			    deposit.setAmount(totalamt);
			    return  repo.save(deposit);
		     }
		else 
		return null;
	}

	@Override
	public Bank withdrawAmount(Bank bank)
	{
		Bank withdraw=repo.findById(bank.getAccountno()).get();
		double totalamt=0.0;
		if((withdraw.getAccountno()==bank.getAccountno()) && (withdraw.getName().equals(withdraw.getName())  && (withdraw.getPsw().equals(bank.getPsw()))))
		     {
			   if(withdraw.getAmount()>=bank.getAmount())
			      {
			           totalamt=withdraw.getAmount()-bank.getAmount();
					    withdraw.setAmount(totalamt);	
			       }
			   return  repo.save(withdraw);
		     }
		else 
		       
		return withdraw;	
	}
	@Override
    public Bank transferAmount(Bank bank, long taccount) 
	{
		Bank senderAcc=repo.findById(bank.getAccountno()).get() ;
		Bank tragetAcc=repo.findById(taccount).get();
		double totalamt=0;
		if(senderAcc.getAccountno()==bank.getAccountno() && senderAcc.getName().equals(senderAcc.getName())  && senderAcc.getPsw().equals(bank.getPsw()))
	     {
			if(senderAcc.getAmount()>bank.getAmount())
			{
				totalamt=senderAcc.getAmount()-bank.getAmount();
				senderAcc.setAmount(totalamt);
				
				repo.save(senderAcc);
				
				totalamt=tragetAcc.getAmount()+bank.getAmount();
				
				tragetAcc.setAmount(totalamt);
				
				repo.save(tragetAcc);
			}
	     }
		return tragetAcc;
			
	}

	//====================================================
	@Override
	public Bank closeAccount(Bank bank) 
	{
		Bank record8=repo.findById(bank.getAccountno()).get();
		 if(record8.getAccountno()==bank.getAccountno() && record8.getName().equals(bank.getName()) && record8.getPsw().equals(bank.getPsw()))
			 record8.setStatus(bank.getStatus());
		 return repo.save(record8);

		
		
	}	
	//=================================================
	@Override
	public double getBalance(Bank bank) 
	{
		
		double balance;
		Bank  balcheck=repo.findById(bank.getAccountno()).get();
		balance=balcheck.getAmount();
		return balance;
		
	}
	
	
	
	

}

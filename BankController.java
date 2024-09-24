package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.web.model.Bank;
import com.web.service.BankService;

@Controller
public class BankController {
	
	@Autowired 
	private BankService service; 
	@RequestMapping("/")
	public String homePage()
	{
		return "home";
	}
	
	@RequestMapping("addbank")
	public String registerPage()
	{
		return "account";
	}
	
	@RequestMapping("/register")
	public String save(Bank bank,ModelMap model)
	{
		Bank b=service.saveBank(bank);
		return "success";
	}
	
	@RequestMapping("/viewbank")
	public String getForm()
	{
		return  "balance";
	}
	@RequestMapping("/login")
	public String viewBalance(Bank bank,ModelMap model)
	{
		model.put("banks", service.checkBalance(bank));
		return "record";
	}
	@RequestMapping("/deposit")
	public String deposit()
	{
		return  "deposit";
	}
	@RequestMapping("/add")
	public String addDeposit(Bank bank,	ModelMap model)
	{
		model.put("bankadd", service.depositAmount(bank));
		
		return "viewdeposit";
	}
	@RequestMapping("/withdraw")
	public String withdrawForm()
	{
		return  "withdraw";
	}
	@RequestMapping("/withdraw1")
	public String withdrawamount(Bank bank,	ModelMap model)
	{
	
		model.put("bankwithdraw", service.withdrawAmount(bank));
		
		return "viewwithdraw";
	}
	
	@RequestMapping("/transfer")
	public String transferForm()
	{
		return  "transfer";
	}
	@RequestMapping("/transfer1")
	public String transferAmount(@RequestParam long taccount,Bank bank,ModelMap model)
	{
		model.put("banktransfer", service.transferAmount(bank, taccount));
	
		
		return "viewtransfer";
	}
	@RequestMapping("/close")
	  public String closepage()
	  {
		  return "closeaccount";
	  }
	 @RequestMapping("/closefrom")
	 public String closeview(Bank bank,ModelMap model)
	 {
		 model.put("record8",service.closeAccount(bank));
		 return "close";
	 }
	  
}	  
	 
	
	
	
	
	
	



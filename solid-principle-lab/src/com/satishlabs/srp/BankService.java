package com.satishlabs.srp;

public class BankService {
	public long deposit(long amount,String accountNo) {
		//deposit amount
		return 0;
	}
	
	public long withDraw(long amount,String accountNo) {
		//withdraw amount
		return 0;
				
	}
	
	public void printPassbook() {
		//update transction info in passbook
	}
	
	public void getLoanInterestInfo(String loanType) {
		if(loanType.equals("homeLoan")) {
			//do some job
		}
		if(loanType.equals("personalLoan")) {
			//do some job
		}
		if(loanType.equals("carLoan")) {
			//do some job
		}
	}
}

package com.satishlabs.dip.solution;

public class CreditCard implements BankCard{
	public void doTransaction(long amount){
		System.out.println("payment using Credit Card");
	}
}

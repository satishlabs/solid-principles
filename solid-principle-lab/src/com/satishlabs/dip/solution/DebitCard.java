package com.satishlabs.dip.solution;

public class DebitCard implements BankCard{
	public void doTransaction(long amount) {
		System.out.println("payment using Debit Card");
	}
}

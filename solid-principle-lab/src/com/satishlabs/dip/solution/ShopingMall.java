package com.satishlabs.dip.solution;

public class ShopingMall {
	private BankCard bankCard;

	public ShopingMall(BankCard bankCard) {
		this.bankCard = bankCard;
	}

	public void doPurchaseSomething(long amount) {
		bankCard.doTransaction(amount);
	}

	public static void main(String[] args) {
		// DebitCard debitCard = new DebitCard();
		// CreditCard creditCard = new CreditCard();

		BankCard bankCard = new DebitCard(); // Run time polymorphism- 
		ShopingMall shopingMall = new ShopingMall(bankCard);
		shopingMall.doPurchaseSomething(2000);
	}
}

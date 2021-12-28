package com.satishlabs.dip;

public class ShopingMall {
	private DebitCard debitCard;

	public ShopingMall(DebitCard debitCard) {
		super();
		this.debitCard = debitCard;
	}
	
	public void doPurchaseSomething(long amount) {
		debitCard.doTransaction(amount);
	}
	
	public static void main(String[] args) {
		DebitCard debitCard = new DebitCard();//In case my debit card is not working- In that case, I need go with Credit card and need to change the complete requirement
		ShopingMall shopingMall = new ShopingMall(debitCard);
		shopingMall.doPurchaseSomething(2000);
	}
}

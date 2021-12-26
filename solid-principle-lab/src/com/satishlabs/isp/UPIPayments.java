package com.satishlabs.isp;

/*
The principle state that the larger interfaces split into smaller onces.
Because the implementation classes use only the methods that are required .
We should not force the client to use the methods that they do not want to use.
* */
public interface UPIPayments {
	public void payMoney();
	public void getScratchCard();
	public void getCashBackAsCreditBalance();
	
}

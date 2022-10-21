package org.bank;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("The Deposit Amount is Rs.10000");
	}
	
	public static void main(String[] args) {
		AxisBank AB = new AxisBank();
		AB.deposit();
		System.out.println("==============================");
		BankInfo BI = new BankInfo();
		BI.deposit();
	}


}

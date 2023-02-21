package org.system;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Deposit");

	}
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.deposit();
		a.fixed();
		a.saving();
		a.deposit();
		
	}

}

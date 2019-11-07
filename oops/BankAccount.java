package com.lti.oops;

public class BankAccount {

	double withdrawAmount, depositAmount, balance;
	protected double interestRate = 9.5;

	void depositMoney(double depamt) { // print deposit amount
		// balance+=depamt;
		depositAmount = depamt;
		System.out.println("The deposit amount is:" + depamt);
	}

	void withdrawMoney(double withdraw) { // print withdraw amount and calc
											// balance
		withdrawAmount = withdraw;
		balance = depositAmount - withdrawAmount;
		System.out.println("Money withdrawn:" + withdrawAmount);
		System.out.println("Balance:" + balance);
	}
}

class NRIAccount extends BankAccount {
	void applyFixedDeposit() {
		super.interestRate = 6.5;
		System.out.println("Interest rate in NRIAccount is:" + interestRate);
	}
}

class SeniorCitizen extends BankAccount {
	void applyFixedDeposit() {
		interestRate = 10.5;
		System.out.println("Interest rate in SeniorCitizen is:" + interestRate);
	}
}
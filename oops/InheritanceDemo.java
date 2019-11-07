package com.lti.oops;

import java.util.*;

public class InheritanceDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter deposit amount:");
		BankAccount b = new BankAccount();
		b.depositMoney(sc.nextDouble());
		System.out.println("Enter withdraw amount:");
		b.withdrawMoney(sc.nextDouble());
		NRIAccount n = new NRIAccount();
		n.applyFixedDeposit();
		SeniorCitizen s = new SeniorCitizen();
		s.applyFixedDeposit();
		sc.close();
	}
}
package application;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Pedro", (0.0));
		BussinessAccount bacc = new BussinessAccount(1003, "Henrique", 0.0, 500.0);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BussinessAccount(1005, "Bob", 0.0 , 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01 );
		
		
		//DOWNCASTING
		
		BussinessAccount acc4 = (BussinessAccount)acc2;
		acc4.loan(100.0);
		
		//BussinessAccount acc5 = (BussinessAccount)acc3;
		if (acc3 instanceof BussinessAccount) {
			BussinessAccount acc5 = (BussinessAccount)acc3;
			acc5.loan(500.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		System.out.println("");
		
		
	}

}

package oopsday3.atm.menu;
import java.util.Scanner;

import oopsday3.atm.extension.InsufficientFundsException;
import oopsday3.atm.extension.NegativeAmountException;
//import oopsday3.atm.menu.Account;
//import oopsday3.atm.menu.BankOfAmerica2;
public class BankMenu {
	BankOfAmerica2 boa=new BankOfAmerica2();
	public BankMenu() {
		Account a1=new Account(101,"john Doe",500,"saving");
		Account a2=new Account(102,"jon Doe",1500,"saving");
		Account a3=new Account(103,"jason Doe",2500,"salary");
		Account a4=new Account(104,"jane Doe",5000,"salary");
		Account a5=new Account(105,"jonas Doe",5400,"pension");



		boa.addAccount(a1);
		boa.addAccount(a2);
		boa.addAccount(a3);
		boa.addAccount(a4);
		boa.addAccount(a5);
	}
	public void menu() {
		// TODO Auto-generated method stub
System.out.println("1.create account \n 2.deposite \n 3).withdraw \n 4)Balance Enquiry \n 5)Exit");

int c;
do
{
	Scanner sc=new Scanner(System.in);
	
	c=sc.nextInt();
	switch(c) {
	case 1:
		System.out.println("enter actno");
		int actno;
		actno=sc.nextInt();
		try {
			boa.displayAccount(actno);
		} catch (NegativeAmountException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		System.out.println("display the details");
	
		break;
	case 2:System.out.println("enter acno");
	       int acno=sc.nextInt();
	       System.out.println("enter amt to be deposite");
	       int amt=sc.nextInt();
	
	
		double balance;
		try {
			balance = boa.desposit(amt,acno);
		} catch (NegativeAmountException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		//System.out.println("deposite is"+balance);
		break;
	case 3:
		{System.out.println("enter acno");
	       int acno1=sc.nextInt();
	       System.out.println("enter amt to be ");
	       int amt1=sc.nextInt();
		
		double balance1=0;
		try {
			balance1 = boa.withdraw(200, 101);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println(balance1);
		}
		break;
	case 4:double balance3=boa.balanace(101);
	System.out.println(balance3);
		break;
	case 5:
		break ;
	
	}
}while(c!=5);




}

}

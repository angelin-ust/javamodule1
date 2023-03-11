package oopsday2.atm;

public class BankTranscation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account a1=new Account(101,"john Doe",500,"saving");
Account a2=new Account(102,"jon Doe",1500,"saving");
Account a3=new Account(103,"jason Doe",2500,"salary");
Account a4=new Account(104,"jane Doe",5000,"salary");
Account a5=new Account(105,"jonas Doe",5400,"pension");

BankOfAmerica2 boa=new BankOfAmerica2();

boa.addAccount(a1);
boa.addAccount(a2);
boa.addAccount(a3);
boa.addAccount(a4);
boa.addAccount(a5);
System.out.println(boa.balanace(103));
double result=boa.desposit(100,101);
System.out.println(result);
result=boa.withdraw(50,103);
System.out.println(result);



}

}

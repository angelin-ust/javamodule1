package oopsday2.atm;

public class BankTranscations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingIrface bom=new BankOfAmerica();
		double balance=bom.desposit(250);
		System.out.println("balance deposit=$"+balance);

		balance=bom.withdraw(175.25);
		System.out.println("balance withdraw= $"+balance);
	}

}

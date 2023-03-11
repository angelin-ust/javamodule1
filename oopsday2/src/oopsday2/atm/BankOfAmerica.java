package oopsday2.atm;

public class BankOfAmerica implements BankingIrface {
	
  private Account account =new Account(1010,"john Doe",500,"salary");
  
	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		account.setBalanace(account.getBalanace()-amount);
		
		return account.getBalanace();
	}

	@Override
	public double desposit(double amount) {
		// TODO Auto-generated method stub
		account.setBalanace(account.getBalanace()+amount);
		return account.getBalanace();
	}

	@Override
	public double balanace(int actno) {
		// TODO Auto-generated method stub
		return account.getBalanace();
	}

}

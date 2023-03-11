package oopsday2.atm;

public class BankOfAmerica2 implements BankingIrface2 {
	private Account[] accounts = new Account[5];

	private int accountIndex = 0;

	public BankOfAmerica2() {
		// TODO Auto-generated constructor stub
	}

	public void addAccount(Account account) {
		if (this.accountIndex < accounts.length)

			accounts[this.accountIndex++] = account;
		else
			System.out.println("operation not allowed ");
	}

// public Account transcationAccount(Account account) {
//	 return account;
// }
	@Override
	public double withdraw(double amount, int acctno) {
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == acctno) {
				tempBal = accounts[i].getBalanace();
				tempBal -= amount;
				accounts[i].setBalanace(tempBal);
				break;
			}
		}
		return tempBal;
	}

	@Override
	public double desposit(double amount, int acctno) {
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == acctno) {
				tempBal = accounts[i].getBalanace();
				tempBal += amount;
				accounts[i].setBalanace(tempBal);
				break;
			}
		}
		return tempBal;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public BankOfAmerica2(Account[] accounts) {
		super();
		this.accounts = accounts;
	}

	@Override
	public double balanace(int acctno) {
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == acctno) {
				tempBal = accounts[i].getBalanace();
				
				break;
			}
		}
		// TODO Auto-generated method stub
		return tempBal;
	}

}

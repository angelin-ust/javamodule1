package oopsday3.atm.menu;
import oopsday3.atm.extension.*;
public class BankOfAmerica2 implements BankingIrface2 {
	private Account[] accounts = new Account[5];

	private int accountIndex = 0;

	public BankOfAmerica2() {
		// TODO Auto-generated constructor stub
	}
 public void displayAccount(int actno) throws NegativeAmountException {
	 for(int i=0;i<accounts.length;i++)
	 {
		 if(accounts[i].getActno()==actno) {
			 System.out.println(accounts[i].getActno());
			 System.out.println(accounts[i].getName());
			 System.out.println(accounts[i].getActype());
			 System.out.println(accounts[i].getBalanace());
			
		 }
	 }
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
	public double withdraw(double amount, int acctno) throws InsufficientFundsException  {
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == acctno) {
				if(accounts[i].getBalanace()<amount) {
					throw new InsufficientFundsException("Insufficient" );
				}
				tempBal = accounts[i].getBalanace();
				tempBal -= amount;
				accounts[i].setBalanace(tempBal);
				break;
			}
		}
		return tempBal;
	}

	@Override
	public double desposit(double amount, int acctno) throws NegativeAmountException {
		double tempBal = 0;
		if(amount<0) {
			throw new NegativeAmountException("cannnot be deposite -ve amt");
		}
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

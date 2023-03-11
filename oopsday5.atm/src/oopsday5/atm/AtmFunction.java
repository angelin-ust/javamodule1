package oopsday5.atm;

public class AtmFunction {
	int amount;
	 int fhcount = 100;
	 int hcount = 100;
	 int fycount = 100;
	 int tycount = 100;
	 int tcount = 100;
	 int ufh=0;
	 int uh=0;
	 int ufy=0;
	 int uty=0;
	 int ut=0;
	 public AtmFunction() {
		// TODO Auto-generated constructor stub
	}
	 
	public AtmFunction(int amount, int ufh, int uh, int ufy, int uty, int ut) {
		super();
		this.amount = amount;
		this.ufh = ufh;
		this.uh = uh;
		this.ufy = ufy;
		this.uty = uty;
		this.ut = ut;
	}

	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getFhcount() {
		return fhcount;
	}
	public void setFhcount(int fhcount) {
		this.fhcount = fhcount;
	}
	public int getHcount() {
		return hcount;
	}
	public void setHcount(int hcount) {
		this.hcount = hcount;
	}
	public int getFycount() {
		return fycount;
	}
	public void setFycount(int fycount) {
		this.fycount = fycount;
	}
	public int getTycount() {
		return tycount;
	}
	public void setTycount(int tycount) {
		this.tycount = tycount;
	}
	public int getTcount() {
		return tcount;
	}
	public void setTcount(int tcount) {
		this.tcount = tcount;
	}
	public int getUfh() {
		return ufh;
	}
	public void setUfh(int ufh) {
		this.ufh = ufh;
	}
	public int getUh() {
		return uh;
	}
	public void setUh(int uh) {
		this.uh = uh;
	}
	public int getUfy() {
		return ufy;
	}
	public void setUfy(int ufy) {
		this.ufy = ufy;
	}
	public int getUty() {
		return uty;
	}
	public void setUty(int uty) {
		this.uty = uty;
	}
	public int getUt() {
		return ut;
	}
	public void setUt(int ut) {
		this.ut = ut;
	}
	 public void check() {
		 if(fhcount<ufh) {
			 System.out.println("insuffient");
		 }
		 else 
		 {
			 fhcount-=ufh;
			 System.out.println(fhcount);
			 
		 }
		 if(hcount<uh) {
			 System.out.println("insuffient");
		 }
		 else 
		 {
			 hcount-=uh;
			 System.out.println(hcount);
			 
		 }
		 if(fycount<ufy) {
			 System.out.println("insuffient");
		 }
		 else 
		 {
			 fycount-=ufy;
			 System.out.println(fycount);
			 
		 }
		 if(tycount<uty) {
			 System.out.println("insuffient");
		 }
		 else 
		 {
			 tycount-=uty;
			 System.out.println(tycount);
			 
		 }
		 if(tcount<ut) {
			 System.out.println("insuffient");
		 }
		 else 
		 {
			 tcount-=ut;
			 System.out.println(tcount);
			 
		 }
		  
	 }
	 
}
package oopsday5.atm;

import java.util.Scanner;

public class AtmImpl extends AtmFunction {
	
	 AtmFunction a=new AtmFunction();
	 Scanner sc=new Scanner(System.in);
	 public void withdraw() {
			// TODO Auto-generated method stub
		   System.out.println("Enter the amount : ");
		   int amt =sc.nextInt();
			System.out.println("Enter the count of 500: ");
			a.setUfh(sc.nextInt());
			System.out.println("Enter the count of  100: ");
			a.setHcount(sc.nextInt());
			System.out.println("Enter the count of 50: ");
			a.setFycount(sc.nextInt());
			System.out.println("Enter the count of 20: ");
			a.setTycount(sc.nextInt());
			System.out.println("Enter the count of 10: ");
			a.setTcount(sc.nextInt());
			a.check();
			
			
		}

		public void balanceCurrency() {
//			// TODO Auto-generated method stub
//			if(a.getUfh()>a.getFhcount()) {
//				System.out.println("insuffient ");
//				
//				}
//			else if(a.getUfh()<a.getFhcount()) {
//				a.fhcount=a.fhcount-a.ufh;
//				System.out.println(a.fhcount);
//				
//			}
//			else if(a.getUh()>a.getHcount()) {
//				System.out.println("insuffient ");
//				
//			}
//			else if(a.getUh()<a.getHcount()) {
//				a.hcount=a.hcount-a.uh;
//				System.out.println(a.hcount);
//				
//			}
//			else if(a.getUfy()>a.getFycount()) {
//				System.out.println("insuffient ");
//			}
	 
}
}


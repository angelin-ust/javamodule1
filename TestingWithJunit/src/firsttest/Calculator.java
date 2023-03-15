package firsttest;

public class Calculator {
 public int power(int b,int e) {
	 int p=1;
	 int i=1;
	 if(b==0|| e==0)
	 {
		 return 1;
	 }
	 else {
		 while(i<=e) {
			 p*=b;
		 }
	 }
	 return p;
 }
 
 public int fact(int n) {
	 
	 int fact =1;
	 for(int i=1;i<=n;i++) {
		 fact *=i;
	 }
	return fact;
	 
 }
 
 public boolean odd(int num) {
	if(num%2==0) {
		return false;
	}
	return true;
 }
 
}

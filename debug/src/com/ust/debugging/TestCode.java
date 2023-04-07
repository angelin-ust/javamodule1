package com.ust.debugging;

public class TestCode {
	
	int factorial(int n) {
		if(n<1)
			return 1;
		return n*factorial(sub(n));
	}
	
	int sub(int n) {
		return n-1;
	}
	
	
	
	int a=0;  //this.b=false we can also do like this cheyum if need this can be also there
	 boolean b=true;
	void  m1(){
	    System.out.println("from m1");
	  }
	void  m2(){
	    this.b=false;
	    System.out.println('1'+ a);
	    System.out.println('2');
	    System.out.println('3');
	    m1();
	    b=true;
	    System.out.println('4'+ a++);
	    System.out.println('5');
	    System.out.println('6'+ a--);
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // new TestCode().m2();
  new TestCode().factorial(5);
	}
	
}

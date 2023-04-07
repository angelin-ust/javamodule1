package com.ust.debugging;

public class TestCode2 {

	int a;
	int b;
	int x;
	int result;
	int a1[]= {2,5,7,8,5};
	int b1[]= {23,43,27,32,12};
	int x1[]= {18,19,20,21,22};
	//ax^2+bx^2+2ab
	void fun() {
		for(int i=0;i<a1.length;i++) {
			a=(a1[i]*(x1[i]*x1[i]));
			b=(b1[i]*(x1[i]*x1[i]));
			x=2*a1[i]*b1[i];
			result=a+b+x;
			System.out.println(result);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   new TestCode2().fun();
	}

}

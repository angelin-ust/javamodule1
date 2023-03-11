package oopsday3.overloading;

public class Math {
	
	//methods can have same name but different parameters
	//overloading happens is that same method can have different datatypes and any more of paramters
public int add(int a,int b) {
	return a+b;
}

public int add(int a,int b,int c) {
	return a+b+c;
}


public double add(double a,double b) {
	return a+b;
}
public double add(double a,double b,double c) {
	return a+b+c;
}


}

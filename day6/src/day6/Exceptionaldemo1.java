package day6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionaldemo1 {

	public static void main(String[] args) //args means command line arguments
	{
		System.out.println("pgm start");
		Scanner sc=new Scanner(System.in);
		

   try {
	   int a=sc.nextInt();
       int b=sc.nextInt();

	   int c=a/b;//point of exception
	   System.out.println(c);
   }catch(ArithmeticException e) {
	   System.out.println("cannot / by zero");
   }catch(InputMismatchException e) {
	   System.out.println("ivalid input");
   }
  System.out.println("pgm end");
	}

}

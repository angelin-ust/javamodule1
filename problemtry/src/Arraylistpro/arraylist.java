package Arraylistpro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<String> al= new ArrayList<String>();
  int n;
//  Scanner sc=new Scanner(System.in);
//  int l=sc.nextInt();
//  for(int i=0;i<l;i++) {
//	 al.add(i);
//  }
  
  al.add("jello");
  al.add("Hello");
  al.add("jello");
  al.add("tello");
  al.add("kello");
  System.out.print(al);
//  for(String s:al) {
//	  System.out.println(s);
//  }
//  Iterator itr=al.iterator();
//  while(itr.hasNext()) {
//	  System.out.println(itr.next());
//  }
  
  
  
  
//  int s=al.size();
//  String a[]=new String[s];
//  for(int i=0;i<s;i++) {
//	  
//	  a[i]=al.get(i);
//	  
//  }
//  
//for(int i=0;i<s;i++) {
//	  
//	 System.out.println(a[i]);
//	  
//  }
//	}
	
	
	
	String a="mamj";
	String b="Ammu";
	StringBuilder s= new StringBuilder(a);{
	s.append(b);
s.reverse();
	System.out.println(s);}
	String t=s.toString();
	if(a.equals(t)) {
		System.out.println("yes");
	}
	else
		System.out.println("no");
	
	

}
}
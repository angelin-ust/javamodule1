package Arraylistpro;

import java.util.ArrayList;

public class Arraytwolist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> al= new ArrayList<Integer>();
		//  int n;
		  al.add(120);
		  al.add(100);
		  al.add(19);
		  al.add(12);
		  al.add(129);
		  
		  ArrayList<Integer> all= new ArrayList<Integer>();
			//  int n;
			  all.add(1);
			  all.add(120);
			  all.add(109);
			  all.add(125);
			  all.add(14);
			  
			  
			al.retainAll(all);
			System.out.println(al);
		 
	}

}

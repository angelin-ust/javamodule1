//Write a Java program to find the second highest number in an ArrayList of integers.

package Arraylistpro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


//Write a Java program to find the second highest number in an ArrayList of integers.



public class removeallevenno {

	public static void main(String[] args) {
ArrayList <Integer> al=new ArrayList<Integer>();

al.add(12);
//al.add(100);
//al.add(4);
al.add(19);
al.add(100);
al.add(127);
al.add(4);

al.add(120);
//al.add(130);
//int max=0;
for(int i=0;i<al.size();i++) {
	if(al.get(i)%2==0) {
		System.out.println("before remove"+al);
		//System.out.println(al.get(i));
		al.remove(i);
		System.out.println("after remove"+al);
	}

}
System.out.println(al);


//Iterator itr=al.iterator();
//while(itr.hasNext()) {
//	if(itr%2==0) {
//		
//	}
//}
	}

}

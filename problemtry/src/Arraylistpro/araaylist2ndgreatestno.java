//Write a Java program to find the second highest number in an ArrayList of integers.

package Arraylistpro;

import java.util.ArrayList;
import java.util.Collections;

public class araaylist2ndgreatestno {

	public static void main(String[] args) {
ArrayList <Integer> al=new ArrayList<Integer>();

al.add(12);
al.add(100);
al.add(19);
al.add(12);
al.add(120);
int max=0;
for(int i=0;i<al.size();i++) {
	if(al.get(i)>max) {
		max=al.get(i);
	}
	else
		continue;
}
System.out.println(max);
int a=al.size();
System.out.println(a);
Collections.sort(al);
System.out.println(al.get(a-2));
//System.out.println("the 2nd largest is ");
//System.out.println(Collections.sort(al));
	}

}

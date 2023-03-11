package Listdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class FrequencyHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="The root interface in the collection hierarchy A collection represents a group of objects known as its elements Some collections allow duplicate elements and others do not Some are ordered and others unordered. The JDK does not provide any direct implementations of this interface: it provides implementations of more specific subinterfaces like Set and List. This interface is typically used to pass collections around and manipulate them where maximum generality is desired.";
		String words[]=str.split(" ");//split 
//	for(String word:words) {
//		System.out.print(word);
//	}
//	
	//int c=0;
	System.out.println(words.length);
	HashMap<String,Integer> letter =new HashMap<>();
	for (String word : words) {
		 
       
        Integer integer = letter.get(word);

        if (integer!= null)
        { 
        	letter.put(word,integer+1);
            
        //System.out.println(" ");
            }

        else 
           
        	letter.put(word, 1);

	
	}
System.out.println(letter);
	}}

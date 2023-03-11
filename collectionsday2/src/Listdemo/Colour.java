package Listdemo;

import java.util.ArrayList;

public class Colour {

	public static void main(String[] args) {
ArrayList<String> colors=new  ArrayList<String>();
colors.add(null);
colors.add("Blue");
colors.add("Yellow");
colors.add("Red");
colors.add("Pink");
colors.add("Green");
String str=colors.get(3);
System.out.println(str);
	}

}

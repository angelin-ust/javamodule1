package Listdemo;
import java.util.ArrayList;
import java.util.Iterator;
public class TestArrayList {
public static void main(String[] args) {
	ArrayList flower=new ArrayList();
	flower.add("Tulips");
	flower.add("Sunflower");
	flower.add("Jasmine");
	flower.add("Lily");
	flower.add(1);
	//flower.add(new Integer("1"));
	flower.add(new java.util.Date());
	flower.add(new Integer("1"));
	flower.add(new Double("10.10"));
	System.out.println(flower);
	String str=(String) flower.get(2);
	Object obj=flower.get(4);
//	System.out.println(str);
//	System.out.println(obj);
	if(obj instanceof Integer) {
		Integer in=(Integer)obj;
		System.out.println(in.MIN_VALUE);
	}
	else if(obj instanceof Double) {
		Double in=(Double)obj;
		System.out.println(in.MAX_VALUE);
	}
	else if(obj instanceof String) {
		 String in=( String)obj;
		System.out.println(in);
	}
	/*
	 * System.out.println(flower); System.out.println(flower.size());
	 * System.out.println(flower.get(2));
	 * System.out.println(flower.contains("lily")); for(Object obj:flower) {
	 * System.out.println(obj); } System.out.println(flower.remove(2));
	 * System.out.println(flower); Iterator iter=flower.iterator();
	 * while(iter.hasNext()) { System.out.println(iter.next()); } for(int
	 * i=0;i<flower.size();i++) { System.out.println(flower.get(i)); }
	 */
}
}

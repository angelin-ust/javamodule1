package Listdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
    TreeMap<String,String> countryCurr=new TreeMap<>();
    countryCurr.put("UK", "Pound");
    countryCurr.put("IND", "Rupe");
    countryCurr.put("USA", "Dollar");
    
    System.out.println(countryCurr);
    System.out.println(countryCurr.get("IND"));
    countryCurr.put("IND", "Rupee");
    System.out.println(countryCurr);
    System.out.println(countryCurr.size());
    System.out.println(countryCurr.containsValue("Dollar"));
    
    
  //hash has 3 views
  	//1.key view
  	
    Set<String> keys= countryCurr.keySet();
	for(String key:keys) {
		System.out.println(key);
	}
	
	
	
	//2.value view
	
	Collection<String> values=countryCurr.values();
	for(String value:values) {
		System.out.println(value);
	}
	
	//3.To get all entries
	Set<Entry<String,String>>entries=countryCurr.entrySet();
	for(Entry<String,String> entry:entries) {
		System.out.println(entry);
	}
	}

	
	
	
	
	
	
	
}

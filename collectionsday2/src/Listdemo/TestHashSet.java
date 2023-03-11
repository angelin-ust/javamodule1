package Listdemo;
import java.util.HashSet;
import java.util.Iterator;
public class TestHashSet {

	public static void main(String[] args) {
 HashSet<String>bookSet=new HashSet<>();
 bookSet.add("Ajava in nutshell");
 bookSet.add("Bjava complete reference");
 bookSet.add("Cjava in 21 days");
 bookSet.add("Djava for dummy");
 bookSet.add(null);
 bookSet.add(null);
 System.out.println(bookSet);
System.out.println(bookSet.size());
System.out.println(bookSet.contains("java in nutshell"));
bookSet.add("Java for dummy");
System.out.println(bookSet);
System.out.println(bookSet.size());
for(String book: bookSet) {
	System.out.println(book);
}
	Iterator iter=bookSet.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	
	
	}

}

package Listdemo;
import java.util.TreeSet;
import java.util.Iterator;
public class TestTreeSet {

	public static void main(String[] args) {
 TreeSet<String>bookSet=new TreeSet<>();
 bookSet.add("Ajava in nutshell");
 bookSet.add("Bjava complete reference");
 bookSet.add("Cjava in 21 days");
 bookSet.add("Djava for dummy");
 //bookSet.add(null); tree set will not allow null element y bcoz they compare with previous value
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

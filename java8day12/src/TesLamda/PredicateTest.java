package TesLamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		List<String> strings=Arrays.asList("Andhra Pradesh","Tamil Nadu", "Kerala", "karnataka");
	
		Predicate<String> p=(String str)->{
			return str.length()>10;
		};
		longString(strings,p);
	}
public static void longString(List<String> strings,Predicate<String> p) {
	for (String str : strings) {
		System.out.println(p.test(str));
	}
}
}

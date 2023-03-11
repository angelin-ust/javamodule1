package TesLamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings=Arrays.asList("Andhra Pradesh","Tamil Nadu", "Kerala", "karnataka");
		Function <String,Integer> f=(str)->{
			return str.length();
			};
			
		printLenght(strings,f);
		
		Function<String,String> f2=(str1)->{
			return str1.toUpperCase();
		};
		printUpperCase(strings,f2);
		
		Function<String,String> f4=(str4)->{
			
			StringBuilder string =new StringBuilder(str4);
			StringBuilder s= string.reverse();
			return s.toString() ;
		};
		
		
		printReverse(strings,f4);
		
		Function<String,String> f3=(str1)->{
			return str1.toLowerCase();
		};
		printLowerCase(strings,f3);
	}
	
	public static void printLenght(List<String> strings, Function<String,Integer> Fref) {
		for(String str:strings) {
			System.out.println(Fref.apply(str));
			
		}	
	}
	
	public static void printUpperCase(List<String> strings, Function<String,String> Fref) {
		for(String str:strings) {
			System.out.println(Fref.apply(str));
			
		}	
	}
	
	public static void printLowerCase(List<String> strings, Function<String,String> Fref) {
		for(String str:strings) {
			System.out.println(Fref.apply(str));
			
		}	}
		
		public static void printReverse(List<String> strings, Function<String,String> Fref) {
			for(String str:strings) {
				System.out.println(Fref.apply(str));
				
			}	
		
		
	}
	
	
	

	}

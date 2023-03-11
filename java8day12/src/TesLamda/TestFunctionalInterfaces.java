package TesLamda;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
public class TestFunctionalInterfaces {

	public static void main(String[] args) {
		
Function <String,Integer> f=(str)->{
	return str.length();
	};
	System.out.println(f.apply("hello"));
	
	
	Function <Integer,Integer> f1=(n)->{
		return n*n;
	};
	
	System.out.println(f1.apply(8));
	
	
	Function <String,String> f2=(str1)->{
		return str1.toUpperCase();
		};
		System.out.println(f2.apply("hello"));
	

	
	
	
	
	}

	
}

package TesLamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings=Arrays.asList("Andhra Pradesh","Tamil Nadu", "Kerala", "karnataka");
	Consumer<String> consumer=(str)->{
		System.out.println(str);
	};
	consumer.accept("i am doing great");
	
	printString(strings,consumer);
	
	}
	public static void printString(List<String> strings, Consumer<String> c)
	{for(String str:strings) {
		c.accept(str);
	}
		
	}
}

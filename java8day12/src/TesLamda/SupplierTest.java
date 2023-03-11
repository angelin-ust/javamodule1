package TesLamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings=Arrays.asList("Andhra Pradesh","Tamil Nadu", "Kerala", "karnataka");
Supplier<String> suppiler=()->{
	return new String("hola!");
};
System.out.println(suppiler.get());
	}
//	public static void printString(List<String> strings, Supplier<String> c)
//	{for(String str:strings) {
//		c.get();
//	}
//		
//	}

}

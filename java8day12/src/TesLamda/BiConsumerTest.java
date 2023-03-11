package TesLamda;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,String>map=new HashMap<>();
  map.put("ola", "o");
  map.put("Hello", "h");
  map.put("Chao", "C");
   map.forEach((k,v)->System.out.println(k+ "for"+v));
   BiConsumer<String,String> bi=(k,v)->System.out.println(k+"for" +v);
	map.forEach(bi);
	}
}

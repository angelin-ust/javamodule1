package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.function.Consumer;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list=new ArrayList<>();
list.add("sun");
list.add("moon");
list.add("jupiter");
list.add("pluto");
list.add("mars");
list.add("venus");
Predicate<String> p=(str)->{
	return str.length()>3 || str.length()<10;
};


long count=list.stream().filter(p).count();	

//long count=list.stream().filter((str)->str.length()>3 || str.length()<10).count();	we can do like onlu
//by predicate like this a filter
//filter uses predicate
	System.out.println(count);
	Function<String,String> g=(str)->{
		
		return str.toUpperCase();
	};
	
	List<String> outList=list.stream().map(g).collect(Collectors.toList());
//map use function
	//List<String> outList=list.stream().map((str)->str.toUpperCase()).collect(Collectors.toList());
	

	System.out.println(outList);
	
	
	Consumer<String> c=(str)->
	{
		System.out.println(str);
	};
//list.stream().forEach(System.out::println);//consumer thats done for the terminals
	
	list.stream().forEach(c);
list.stream().filter(p).map(g).forEach(c);
	
	}

}

package source.use.mod;

import source.mod.HelloWorld;

public class UseHelloWorld {
public static void main(String[] args) {
	
	var x="anil";
	//x=20 not possible one line one assignment
	var y=23.76;
	var z='c';
	System.out.println(x.length());
	
//	var a;
//	a=20; type inference aa assignment in next pattilaaa
	
	
	
	try {
		HelloWorld world= new HelloWorld();
		world.message();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}

package source;

public class NonSubClass {
public NonSubClass() {
	Parent p=new Parent();// not inherited class nonsubclass can be accessed thr a obj
	System.out.println(p.b);
	System.out.println(p.c);
	System.out.println(p.d);
}
}

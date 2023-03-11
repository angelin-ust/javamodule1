package another;
import source.Parent;
public class NonSubClass {
	
	public NonSubClass() {
		Parent p=new Parent();
		System.out.println(p.d);//here we can only access the public 
	}
	

}

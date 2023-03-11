package another;
import source.Parent;
public class SubClass extends Parent{
	public SubClass() //in class we need to put constructor to print
	{
		//System.out.println(a);//private we cant
		//System.out.println(b);//default also not possible
		System.out.println(c);
		System.out.println(d);
	}

}

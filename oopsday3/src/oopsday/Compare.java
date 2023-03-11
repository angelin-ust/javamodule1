package oopsday;

public class Compare {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		
		Triangle t1=new Triangle();
		Triangle t2=new Triangle();
		
		
		//comparing primitives
		int a=10;
		int b=25;
		boolean result= a==b; //are the equor not
		System.out.println(result);//false
		//comparing object 1.comparing reference 2.comparing members
		result =r1==r2;
		System.out.println(result);//false
		result =t1==t2;
		System.out.println(result);//false
		//result =t1==r1; incompatiable type 
		
		Rectangle r3=r1;
		result= r3==r1;
		System.out.println(result);//true
		System.out.println(r1.hashCode());
		System.out.println(r3.hashCode());
		result=r1.equals(r2);
		System.out.println(result);//false
		
		result=r1.equals(r3);
		System.out.println(result);//false
		
		
		//comparing the  data members
		r1.setLength(35.5);
		r1.setBreadth(75.6);
		
		r2.setLength(35.5);
		r2.setBreadth(75.6);
		
		if(r1.getLength()==r2.getLength()) {
			System.out.println("they have same lenght and breadth");
		}
		else
			System.out.println("they dont have same lenght and breadth ");
		
		//we are not comparing the object
		//we are comparing data members of 2 object
		
		
		t1.setS1(35.5);
		t1.setS2(45.6);
		t1.setS3(67.7);
		
		if(r1.getLength()==t1.getS1()) {
			System.out.println("they have same");
		}
		else
			System.out.println("they dont have same  ");
		
		
	}

}

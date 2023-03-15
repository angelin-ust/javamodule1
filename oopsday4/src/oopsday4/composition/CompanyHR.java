package oopsday4.composition;

public class CompanyHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address res=new Address("31","Mannath","Worli","Mumbai",400048);
		Address commAdd=new Address("32","Antela..","Bandra","Mumbai",400032);
		Employee emp1=new Employee("John Doe","male",24,101,"Research",500,res,commAdd);
		
		Employee emp2=new Employee("Jomn Doe","male",29,103,"Trainee",2500,res,commAdd);
		
		Employee emp3=new Employee("Jhnas Doe","male",30,104,"Research",3500,res,commAdd);
		
		Employee emp4=new Employee("Jonan Doe","female",24,105,"Trainee",9500,res,commAdd);
		
 Employee emp5=new Employee("John Doe","male",24,101,"Research",500,res,commAdd);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);
		
		
		
		if(emp1.equals(emp5)) {
			System.out.println("is same" );
		}
		else
			System.out.println("is not");
	}

}

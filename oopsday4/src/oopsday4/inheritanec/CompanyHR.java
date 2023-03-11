package oopsday4.inheritanec;

public class CompanyHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("John Doe","male",24,101,"Research",500);
		
		Employee emp2=new Employee("Jomn Doe","male",29,103,"Trainee",2500);
		
		Employee emp3=new Employee("Jhnas Doe","male",30,104,"Research",3500);
		
		Employee emp4=new Employee("Jonan Doe","female",24,105,"Trainee",9500);
		
 Employee emp5=new Employee("John Doe","male",24,101,"Research",500);
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

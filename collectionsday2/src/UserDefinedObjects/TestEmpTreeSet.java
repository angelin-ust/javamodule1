package UserDefinedObjects;



import java.util.TreeSet;

public class TestEmpTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Employee> empSet=new TreeSet<>();

Employee emp1=new Employee("John Doe","male",24,101,"Research",500);

Employee emp2=new Employee("Jomn Doe","male",29,103,"Trainee",2500);

Employee emp3=new Employee("Jhnas Doe","male",30,104,"Research",3500);

Employee emp4=new Employee("Jonan Doe","female",24,105,"Trainee",9500);
 
Employee emp5=new Employee("John Doe","male",24,101,"Research",500);
empSet.add(emp1);
empSet.add(emp2);
empSet.add(emp3);
empSet.add(emp4);
empSet.add(emp5);
System.out.println(empSet);
System.out.println(empSet.size());
	}

}

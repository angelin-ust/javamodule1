package UserDefinedObjects;

import java.util.ArrayList;

public class TestEmpArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Employee> empList=new ArrayList<>();

Employee emp1=new Employee("John Doe","male",24,101,"Research",500);

Employee emp2=new Employee("Jomn Doe","male",29,103,"Trainee",2500);

Employee emp3=new Employee("Jhnas Doe","male",30,104,"Research",3500);

Employee emp4=new Employee("Jonan Doe","female",24,105,"Trainee",9500);

empList.add(emp1);
empList.add(emp2);
empList.add(emp3);
empList.add(emp4);
System.out.println(empList);
	}

}

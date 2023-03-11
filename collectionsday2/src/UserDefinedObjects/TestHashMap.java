package UserDefinedObjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("John Doe","male",24,101,"Research",500);

		Employee emp2=new Employee("Jomn Doe","male",29,103,"Trainee",2500);

		Employee emp3=new Employee("Jhnas Doe","male",30,104,"Research",3500);

		Employee emp4=new Employee("Jonan Doe","female",24,105,"Trainee",9500);
		ArrayList<Employee> empList=new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		//System.out.println(empList);
		
		HashSet<Employee> empSet=new HashSet<>();
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		//empSet.add(emp5);
		/*
		 * System.out.println(empSet); System.out.println(empSet.size());
		 */
		TreeSet<Employee> EmpSet=new TreeSet<>();
		EmpSet.add(emp1);
		EmpSet.add(emp2);
		EmpSet.add(emp3);
		EmpSet.add(emp4);
		//empSet.add(emp5);
		//System.out.println(EmpSet);
		
		HashMap<String,Collection> empMap=new HashMap<>(); 
		empMap.put("empList", empList);
		empMap.put("empSet", empSet);
		empMap.put("EmpSet", EmpSet);
		System.out.println(empMap);
		
		
Collection<Employee> list =empMap.get("empList");

Iterator<Employee> iter=list.iterator();
while(iter.hasNext()) {
//	list 
	
	System.out.println(iter.next()); 
	}

Collection<Employee> set =empMap.get("empSet");
iter=set.iterator();
while(iter.hasNext()) {
//	list 
	
	System.out.println(iter.next()); 
	}
Collection<Employee> tree =empMap.get("EmpSet");
iter=tree.iterator();
while(iter.hasNext()) {
//	list 
	
	System.out.println(iter.next()); 
	}

}
	}



package oopsday4.inheritanec;

import java.util.Objects;

public class Employee extends Person {
private long empid;
private String deptno;
private double salary;
public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(String name, String gender, int age,long empid,String deptno, double salary) {
	super(name, gender, age);
	this.empid=empid;
	this.deptno =deptno;

	this.salary=salary;
}

/*
 * @Override public boolean equals(Object obj) { // TODO Auto-generated method
 * stub Employee ref=null; if(obj!=null) ref=(Employee) obj; if(ref.getEmpid()==
 * this.empid && ref.getName().equals(this.getName())&& ref.getDeptno()==
 * this.deptno) return true; else return false;
 * 
 * 
 * // return super.equals(obj); }
 * 
 * @Override public int hashCode() { int code =this.hashCode() *32* ((int)
 * this.getEmpid())* (this.getName().length())*this.deptno.length(); // TODO
 * Auto-generated method stub return super.hashCode(); }
 * 
 * @Override
 */
public String toString() {
	return "Employee [empid=" + empid + ", deptno=" + deptno + ", salary=" + salary + ", getName()=" + getName()
			+ ", getGender()=" + getGender() + ", getAge()=" + getAge() + "]";
}
@Override             
public int hashCode() {
	return Objects.hash(deptno, empid, salary);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(deptno, other.deptno) && empid == other.empid
			&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
}
public long getEmpid() {
	return empid;
}
public void setEmpid(long empid) {
	this.empid = empid;
}
public String getDeptno() {
	return deptno;
}
public void setDeptno(String deptno) {
	this.deptno = deptno;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

}

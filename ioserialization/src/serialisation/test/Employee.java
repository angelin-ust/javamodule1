package serialisation.test;
import java.io.Serializable;

public class Employee   implements Serializable {

  private int empno;
  transient private String password;
	private String name;
	public Employee(int empno, String name, double salary,String password) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", password=" + password + ", name=" + name + ", salary=" + salary + "]";
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	static double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
}

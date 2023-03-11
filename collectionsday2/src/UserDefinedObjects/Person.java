package UserDefinedObjects;

public class Person {
	//data member is 1st initialsed the we used constructor then we getter and setter 
private String name;
private String gender;
private int age;

public Person() {
	
}

public Person(String name, String gender, int age) {
	super();
	this.name = name;
	this.gender = gender;
	this.age = age;
}

@Override
public String toString() {
	return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
}

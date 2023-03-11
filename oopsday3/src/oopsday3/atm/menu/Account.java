package oopsday3.atm.menu;
//data object
public class Account {
private int actno;
private String name;
private double balanace;
private String actype;

public Account(int actno, String name, double balanace, String actype) {
	super();
	this.actno = actno;
	this.name = name;
	this.balanace = balanace;
	this.actype = actype;
}

public int getActno() {
	return actno;
}

public void setActno(int actno) {
	this.actno = actno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getBalanace() {
	return balanace;
}

public void setBalanace(double balanace) {
	this.balanace = balanace;
}

public String getActype() {
	return actype;
}

public void setActype(String actype) {
	this.actype = actype;
}
}

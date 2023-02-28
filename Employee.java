package interviewpractice;

import java.io.Serializable;
import java.math.BigDecimal;

public class Employee implements Serializable{
int id;
String name;
int age;
BigDecimal salary;
long salary1;
public Employee(int id, String name, BigDecimal i) {
	super();
	this.id = id;
	this.name = name;
	this.salary = i;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Employee(int id2, String name2, int i) {
	// TODO Auto-generated constructor stub
	super();
	this.id = id;
	this.name = name;
	this.salary1 = i;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public BigDecimal getSalary() {
	return salary;
}
public void setSalary(BigDecimal salary) {
	this.salary = salary;
}

}

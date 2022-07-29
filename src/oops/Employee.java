package oops;

public class Employee {
int empid;
String empname;
int salary;

void display() {
	System.out.println(empid);
	System.out.println(empname);
	System.out.println(salary);
	
}

//Employee(int id, String name, int sal){
//	empid=id;
//	empname=name;
//	salary=sal;
//
//}

void setData(int id, String name, int sal) {
	empid=id;
	empname=name;
	salary=sal;
}

public static void main(String[] args) {
	
	
	//Assigning values to class variables using object
/*	Employee emp1 = new Employee();//here Employee is Class, emp1 is object reference variable, Employee() is instantiation and new is a keyword
	emp1.empid=101;
	emp1.empname= "Tom";
	emp1.salary= 10000000;
	emp1.display();
	
	Employee emp2 = new Employee();
	emp2.empid=102;
	emp2.empname= "John";
	emp2.salary= 20000000;
	emp2.display();*/
	
	//Assigning values to class variable using constructor
	/*Employee emp1 = new Employee(101,"Tom",1000000);
	emp1.display();
	
	Employee emp2 = new Employee(102,"John",2000000);
	emp2.display();*/
	
	
	//Assigning values to class using method
	Employee emp1 = new Employee();
	emp1.setData(101,"Tom",1000000);
	emp1.display();
	
	Employee emp2 = new Employee();
	emp2.setData(102,"John",2000000);
	emp2.display();
}

}

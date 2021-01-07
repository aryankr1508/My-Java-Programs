import java.util.*;

import java.util.Arrays;
import java.util.stream.Stream;

class Employee{
	String name;
	int id;
	double salary;
	Employee(String a, int b, double c)  {
		name= a;
		id= b;
		salary= c;
	}
	public void showData() {
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Month salary: "+salary);
	}
	
}

public class assignment1  {
	
	public static void main(String [] args)  {
		Employee[] employess= { new Employee("Rachita", 1001,100000), new Employee("Sohum", 1002, 200000), new Employee("Sujata", 1003, 300000)};

empstream.forEach(p ->p.showData());
	}
}
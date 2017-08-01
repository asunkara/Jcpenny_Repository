package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

class Employee{
	
	
	String age,name;
	int sal;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	Employee(String age, String name,int sal){
		this.age=age;
		this.name=name;
		this.sal=sal;
	}
}

class Customer{
	String fname,lname;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	Customer(String fname, String lname){
		this.fname=fname;
		this.lname=lname;
	}
}

public class AgeComparator{
	
	public static void main(String[] args) {
		Employee emp = new Employee("10", "arif", 100);
		Customer cus = new Customer("ashok", "s");
		List set = new LinkedList();
		set.add(emp);
		set.add(cus);
		Iterator it = set.iterator();
		while(it.hasNext()){
			Object o = it.next();
			if(o instanceof Employee){
				System.out.println("..");
				Employee e = (Employee)o;
				System.out.println(e.age);
			}else{
				System.out.println("......");
			}
			System.out.println(o);
		}
		System.out.println(set);
	}
	
	
}



package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {

	int rollno;  
	String name;  
	int age;  
	
	
	Student(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	} }
	
	class Customer1 {
		int marks;
		int rank;
		Customer1(int rank,int marks){
			this.rank=rank;
			this.marks=marks;
			
		}
	}
	 class Comparator_Age1{
		public static void main(String[] args) {
		Student s=new Student(101, "Ashok", 26);
		Customer1 c=new Customer1(108, 526);
		ArrayList ref=new ArrayList();
		ref.add(s);
		ref.add(c);
		Iterator r=ref.iterator();
		while(r.hasNext()){
			Object o =r.next();
			System.out.println(0);
		}
		} 
		}
	
	


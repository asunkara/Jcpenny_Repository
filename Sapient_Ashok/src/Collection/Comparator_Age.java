package Collection;

import java.util.ArrayList;
import java.util.Iterator;

 class Student1 {

	int rollno;  
	String name;  
	int age;  
	
	
	Student1(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	} }
	
	class Customer_marks {
		int marks;
		int rank;
		Customer_marks(int rank,int marks){
			this.rank=rank;
			this.marks=marks;
			
		}
	}
	public class Comparator_Age{
		public static void main(String[] args) {
		Student1 s=new Student1(101, "Ashok", 26);
		Customer_marks c=new Customer_marks(108, 526);
		ArrayList ref=new ArrayList();
		ref.add(s);
		ref.add(c);
		Iterator r=ref.iterator();
		while(r.hasNext()){
			Object o =r.next();
			System.out.println("Ashok");
			System.out.println(o);
		}
		
		
		} 
			}
	
	


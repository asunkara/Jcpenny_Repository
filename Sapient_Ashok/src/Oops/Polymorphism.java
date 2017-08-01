package Oops;
//overriding method
public class Polymorphism {

	public static void main(String[] args) {
		Polymorphism n =new Polymorphism();
		n.m1();
		n.m1(10);
		n.m1(10,20);
		
	}
	private void m1(int i, int j) {
		System.out.println(i+j+"two variables");
		
	}
	private void m1(int i) {
		
		System.out.println(+i+"one variable");
	}
	

	private void m1() {
		
		System.out.println("default method");
	}

}

package Oops;

public class PolyParent extends ChildOne{

	public static void main(String[] args) {
		ChildOne c=new PolyParent();
c.m1();
	}}

class ChildOne{
	ChildOne m1(){
		
		System.out.println("return value");
	return new ChildOne();
}}


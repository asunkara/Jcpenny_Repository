package Oops;

public class PolymorphismOverridenOne extends Child{
	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.a);
	}

}
class Child  {
	int a=10;
	
}
package Collection;

import java.util.ArrayList;

public class ArrayList_E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Array1> al=new ArrayList<Array1>();
    Array1 ar1 =new Array1(10,"ashok");
    Array1 ar2 =new Array1(11,"harsha");
    al.add(ar1);
    al.add(ar2);
    for(Array1 ref:al){
    	System.out.println("id  "+ref.i+  "name  "+ref.name);
    }
     
   	}
    }

class Array1{
	int i;
	String name;
	Array1(int i,String name){
		
		this.i=i;
		this.name=name;
		
 }	
 }

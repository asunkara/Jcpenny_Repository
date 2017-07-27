package Sample;

public class FactorialExample {
	public static int factorial(int i) {
		if(i==0){
		return 1;
		}else{
			return ((i-1)*i);
		}
	}
		 public static void main(String args[]){  
			 int num=6,fact=1;
			int m= factorial(num);
			System.out.println("fact"+m);
			}
			
		}
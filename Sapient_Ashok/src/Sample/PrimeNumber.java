package Sample;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int i,n=245,flag=0;
		
		for(i=0;i<n/2;i++){
			if(n%2==0){
				System.out.println("prime number");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("not prime numbeer");
			
		
		
}}

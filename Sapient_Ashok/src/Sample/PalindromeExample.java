package Sample;

public class PalindromeExample {

	public static void main(String[] args) {
		
		int sum=0,temp,n=202;
		temp=n;
		while(n>0){
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		if(sum==temp){
			System.out.println("palidram");
		}else{
			System.out.println("not palidram");
		}
	}

}

package Sample;

public class ArmstrongExample {

	public static void main(String[] args) {
		int i=153,temp,sum=0;
		temp=i;
		while(i>0){
		int r=i%10;
		i=i/10;
		sum=sum+(r*r*r);
		}
		if(sum==temp){
		System.out.println(" amstrong");
		
		}

else {
		System.out.println("not amstrong");
	}

}}

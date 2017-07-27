package Sample;

public class Fibonacci {


	public static void main(String[] args) {
		
	/*int febvalue=15;
		int[] feb=new int[febvalue];
		feb[0]=0;
		feb[1]=1;
		for(int i=2;i<febvalue;i++){
			feb[i]=feb[i-1]+feb[i-2];
				
		}
		
		for(int i=0;i<febvalue;i++){
			System.out.println(feb[i]);
		}
			
		}
		*/
	
	int i=0,j=1,k,count=15;	
	System.out.println(i+" "+j);
	for(int n=0;n<count;n++){
	
		k=i+j;
		System.out.println(k);
		i=j;
		j=k;
		
		
		
	}	
		
		
	}

}

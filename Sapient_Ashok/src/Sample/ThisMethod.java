package Sample;

 class ThisMethod1 { 
		void m(){
			System.out.println("hello m");}  
		void n(){  
		System.out.println("hello n");  
		//m();//same as this.m()  
		this.m();  
		}  
		}  
		class ThisMethod{  
		public static void main(String args[]){  
			ThisMethod1 a=new ThisMethod1();  
		a.n();  
		}}  
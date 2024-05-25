
public class Sample {
	
	int a=100,b=200; // the value of a and b is 10, 20
	
	Sample(int a, int b){
		
		//this.a = a; // here this keyword change the local variable to global variable 
		//this.b = b; //we can use a and b in other function this is use to 
		int s=a+b;
		System.out.println(s);
		//System.out.println();
	}
	
	void sum() {
		int sum=a+b;
		System.out.println(sum);
		//System.out.println(this.a);
	}


}

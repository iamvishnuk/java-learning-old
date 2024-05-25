package functionsample;

import java.util.Scanner;

public class FunctionSample {

	public static void main(String arg[]) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter two number");
		
		int num1=s.nextInt();
		int num2=s.nextInt();
		
		int result=sum(num1,num2);
		
		System.out.println("Result :"+result);
		
		
	}
	
	static int sum(int a,int b) {
		int sum=a+b;
		return sum;
	}
}

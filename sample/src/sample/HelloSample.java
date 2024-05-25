package sample;

import java.util.Scanner;

public class HelloSample {

		public static void main(String arg[]) {
			
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter two numbers");
			
			int a=s.nextInt();
			int b= s.nextInt();
			
			int sum=a+b;
			
			System.out.println("Result :"+sum);
		}
}

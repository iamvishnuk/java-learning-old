package ifsample;

import java.util.Scanner;

public class IfSample {

	public static void main(String args[]) {
		
		Scanner n=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num=n.nextInt();
		 
		if(num>0) {
			System.out.println("Positive Number");
		}else {
			System.out.println("Negative Number");
		}
	}
	
}

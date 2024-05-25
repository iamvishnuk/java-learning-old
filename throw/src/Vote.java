import java.util.Scanner;

import hai.Sample;

public class Vote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the age");
		int age = sc.nextInt();
		try {
			if(age<18) {
				throw new AgeLimitException("below 18 not eligible");
			}else {
				System.out.println("Eligible to vote");
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
		System.out.println("Hai Hello");
	}

}

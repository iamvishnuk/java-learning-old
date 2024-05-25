import java.util.Scanner;

public class BasicMaths {
	
	public static void main(String arg[]) {
		
		Scanner s=new Scanner(System.in);
		
		Calcuations bs=new Calcuations();
		
		System.out.println("Enter 2 numbers");
		
		int n1=s.nextInt();
		int n2=s.nextInt();
		
		System.out.println("Please select the operation\n 1 for Addition\n 2 for Subtraction\n 3 for Multiplication\n 4 for Division");
		
		int choice=s.nextInt();
		
		
		
		switch (choice) {
		case 1:
			bs.addition(n1,n2);
			break;
		case 2:
			bs.substraction(n1, n2);
			break;
		case 3:
			bs.multiplication(n1, n2);
			break;
		case 4:
			bs.division(n1, n2);
			break;
		default:
			System.out.println("Wrong Selection");
			
		}
		
	}

}

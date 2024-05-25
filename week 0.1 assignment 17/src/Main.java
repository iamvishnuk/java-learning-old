import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Maths obj = new Maths();
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter 2 numbers");
		int num1=in.nextInt();
		int num2=in.nextInt();
		
		System.out.println("Please select the operation\n 1 for Addition\n 2 for Subtraction\n 3 for Multiplication\n 4 for Division");
		int choice=in.nextInt();
		
		switch(choice) {
		case 1:
			obj.addition(num1, num2);
			break;
		case 2:
			obj.subtraction(num1, num2);
			break;
		case 3:
			obj.multiplication(num1, num2);
			break;
		case 4:
			obj.division(num1, num2);
			break;
			default :
				System.out.println("Invalid selection");
		}
		
	}

}

import java.util.Scanner;

public class MyClass extends Area {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		MyClass mc=new MyClass();
		
		System.out.println("Enter your choice\n 1.Circle\n 2.Square\n 3.Rectangle\n 4.Triangle");
		int choice=s.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter the radius of circle");
			int r=s.nextInt();
			mc.circle(r);
			break;
		case 2:
			System.out.println("Enter the length of square");
			int l=s.nextInt();
			mc.square(l);
			break;
		case 3:
			System.out.println("Enter the width and length of rectangle");
			int w=s.nextInt();
			int le=s.nextInt();
			mc.rectangle(w, le);
			break;
		case 4:
			System.out.println("Enter the base and height of triangle");
			int b=s.nextInt();
			int h=s.nextInt();
			mc.triangle(b, h);
			break;
			default :
				System.out.println("Invalid Selection");
			}
		
	}

}

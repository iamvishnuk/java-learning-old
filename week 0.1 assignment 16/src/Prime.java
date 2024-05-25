import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int flag=0;
		
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Entered number is not prime");
		}else {
			System.out.println("Entered number is prime");
		}
		
		
	}

}

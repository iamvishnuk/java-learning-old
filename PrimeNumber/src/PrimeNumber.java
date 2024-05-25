import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String arg[]) {
		
		Scanner s=new Scanner(System.in);
		int flag=0;
		
		System.out.println("Enter the number");
		
		int num=s.nextInt();
		
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not prime Number");
		}
	}

}

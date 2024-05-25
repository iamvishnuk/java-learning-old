import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String[] name = new String[100];
		int n=8;
		
		System.out.println("Enter the name = ");
		for(int i=0;i<100;i++) {
			name[i] = s.nextLine();
		}
		printName(name,n);
		
	}
	
	static void printName(String name,n) {
		if(n>0) {
			System.out.println(name);
			n=n=1;
			printName(name,n);
		}else {
			return;
		}
	}

}

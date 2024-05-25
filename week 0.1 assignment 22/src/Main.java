import java.util.Scanner;

public class Main {
	
	int limit;
	int arr1[][] = new int[100][100];
	int arr2[][] = new int[100][100];
	int sum[][] = new int[100][100];
	
	public static void main(String[] args) {
		
		Main m=new Main();
		
		m.getArray();
		m.addArray();
		m.displayArray();
		
	}
	
	void getArray(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit of array");
		int limit=s.nextInt();
		int arr1[][] = new int[100][100];
		int arr2[][] = new int[100][100];
		System.out.println("Enter the values of array 1");
		for(int i=0;i<limit;i++) {
			for(int j=0;j<limit;j++) {
				arr1[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter the values of array 2");
		for(int i=0;i<limit;i++) {
			for(int j=0;j<limit;j++) {
				arr2[i][j]=s.nextInt();
			}
		}
		this.limit=limit;
		this.arr1=arr1;
		this.arr2=arr2;
	}

	void addArray() {
		int sum[][] = new int[100][100];
		for(int i=0;i<limit;i++) {
			for(int j=0;j<limit;j++) {
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		this.sum=sum;
	}
	void displayArray() {
		System.out.println("Sum of array 1 and 2");
		for(int i=0;i<limit;i++) {
			for(int j=0;j<limit;j++) {
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
}

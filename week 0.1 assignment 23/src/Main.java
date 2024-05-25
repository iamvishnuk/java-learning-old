import java.util.Scanner;

public class Main {
	int limit;
	int arr[][] = new int[100][100];
	
	public static void main(String[] args) {
		
		Main m=new Main();
		
		m.getArray();
		m.displayArray();

	}
	
	 void getArray(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit of array");
		int limit=s.nextInt();
		int arr[][] = new int[100][100];
		System.out.println("Enter the values of array");
		for(int i=0;i<limit;i++) {
			for(int j=0;j<limit;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		this.limit=limit;
		this.arr=arr;
	}
	 
	 void displayArray() {
		 System.out.println("Array elements are :");
		 for(int i=0;i<limit;i++) {
			 for(int j=0;j<limit;j++) {
				 System.out.print(arr[i][j]+"\t");
			 }
			 System.out.println();
		 }
	 }

}


public class B extends A {
	
	int a;
	
	B(){
		System.out.println("constructor of B");
	}
	
	B(int a){
		super(2);// with out this only the first constructor is called in the case of constructor with argument
		System.out.println("constructor of B with argument");
	}
	
	void display() {
		System.out.println("Class B");
		
		a=10;
		super.a=20;//assigning value to the base class variable a
		
		int c=a+super.a;
		System.out.println(c);
		
//		super.display();//super is used to call function in base class without this we can only call function in class B
	}
	
	void baseDisplay() { //extra function for calling base class
		super.display();
	}
	
	public static void main(String[] args) {
		
		B b=new B(10);
		
//		b.display();//this will only call the function in sub class(class B)
//		b.baseDisplay();// base function calling
		
	}

}

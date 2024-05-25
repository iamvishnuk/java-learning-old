package inheritanceSample;

public class Sample {
	
	public static void main(String[] args) {
		
		B obj=new B(); // because of inheritance we can access the functions in the class b
		
		obj.display(); // function from the class A
		obj.displayB(); // function from the class B
		
	}

}

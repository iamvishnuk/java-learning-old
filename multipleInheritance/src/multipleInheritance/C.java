package multipleInheritance;

public class C implements A,B{

	@Override
	public void display() {
		System.out.println("hello world");
		
	}
	
	public static void main(String[] args) {
		C c=new C();
		c.display();
	}

}

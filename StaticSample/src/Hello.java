
public class Hello {
	
	int a=10;
	static int b=20;
	
	public static void main(String a[]) {
		
		Hello h=new Hello();
		Hello h1=new Hello();
		
		System.out.println(h.a);
		h.hello();
		
		h.b=50;
		
		h.a=100;
		
		h1.b=100;
		
		h1.a=1500;
		
		b=2500;
		
		System.out.println("h.a");
		
		
	}
	
	void hello() {
		
	}

}

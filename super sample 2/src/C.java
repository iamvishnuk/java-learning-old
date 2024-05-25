package hai
public class C extends B{
	
	void display() {
		
		System.out.println("class C");
	}
	void baseDisplay() {
		super.display();
	}
	public static void main(String[] args) {
		C c=new C();
		c.baseDisplay();
	}

}


public class Area {
	
	void circle(int r){
		double p = 3.14;
		double area = p*(r*r);
		System.out.println("Area = "+area);
		
	}
	void square(int l) {
		int area = l*l;
		System.out.println("Area = "+area);
	}
	void rectangle(int w, int le) {
		int area = w*le;
		System.out.println("Area = "+area);
	}
	void triangle(int b, int h) {
		double area = 0.5*b*h;
		System.out.println("Area = "+area);
	}

}

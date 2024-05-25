package abstractSample2;

public class TextScanner {
	
	Hello obj;
	
	public TextScanner(Hello obj) {
		
		this.obj=obj;
		
	}
	void scan() {
		obj.ontext("Scanned text");
	}

}

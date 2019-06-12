package Package1;

public class Class1_26_May {

	
	public Class1_26_May() {
		this(23,45,56);
		System.out.println("This is Parent : Default Constructor");
	}
	
	public Class1_26_May(int a) {
		this();
		System.out.println("This is Parent : 1 Parameter Constructor");
	}
	
	public Class1_26_May(int a, int b) {
		this(45);
		System.out.println("This is Parent : 2 Parameter  Constructor");
	}
	
	public Class1_26_May(int a, int b, int c) {
		System.out.println("This is Parent : 3 Parameter  Constructor");
	}
}

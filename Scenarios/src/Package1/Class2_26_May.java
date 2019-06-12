package Package1;

public class Class2_26_May extends Class1_26_May {

	public Class2_26_May() {
		this(34);
		System.out.println("This is Child : Default Constructor");
	}
	
	public Class2_26_May(int a) {
		this(24,45,56);
		System.out.println("This is Child : 1 Parameter Constructor");
		System.out.println("Hello ! Changes has been done");
	}
	
	public Class2_26_May(int a, int b) {
		this();
		System.out.println("This is Child : 2 Parameter  Constructor");
	}
	
	public Class2_26_May(int a, int b, int c) {
		super(45,65);
		System.out.println("This is Child : 3 Parameter  Constructor");
	}
	
	public static void main(String[] args) {
		
    Class2_26_May obj = new Class2_26_May(24,54);
	}

}

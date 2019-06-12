package Package1;

public class Class1_26_May2_Method {

	
	public void Class1_26_May2_Method1() {
		this.Class1_26_May2_Method4(23,45,56);
		System.out.println("This is Parent : Default Method");
	}
	
	public void Class1_26_May2_Method2(int a) {
		this.Class1_26_May2_Method1();
		System.out.println("This is Parent : 1 Parameter Method");
	}
	
	public void Class1_26_May2_Method3(int a, int b) {
		this.Class1_26_May2_Method2(45);
		System.out.println("This is Parent : 2 Parameter Method");
	}
	
	public void Class1_26_May2_Method4(int a, int b, int c) {
		System.out.println("This is Parent : 3 Parameter Method");
	}
}

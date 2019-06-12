package Package1;

public class Class2_26_May2_Method extends Class1_26_May2_Method {

	public void Class2_26_May2_Method1() {
		this.Class2_26_May2_Method2(34);
		System.out.println("This is Child : Default Method");
	}
	
	public void Class2_26_May2_Method2(int a) {
		this.Class2_26_May2_Method4(24,45,56);
		System.out.println("This is Child : 1 Parameter Method");
	}
	
	public void Class2_26_May2_Method3(int a, int b) {
		this.Class2_26_May2_Method1();
		System.out.println("This is Child : 2 Parameter Method");
	}
	
	public void Class2_26_May2_Method4(int a, int b, int c) {
		super.Class1_26_May2_Method3(34, 56);
		System.out.println("This is Child : 3 Parameter Method");
	}
	
	public static void main(String[] args) {
		
    Class2_26_May2_Method obj = new Class2_26_May2_Method();
    obj.Class2_26_May2_Method3(34, 45);
	}

}

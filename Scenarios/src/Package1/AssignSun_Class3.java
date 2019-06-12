package Package1;

public class AssignSun_Class3 {

	int x = 10;
    int y = 20;
	public void method3() {  
		 System.out.println("This is method 3 calling.....");
		 this.method4();
	}
	
    public void method4() {  
		 System.out.println("This is method 4 calling.....");
	}

    public void method5(AssignSun_Class2 b) {
       	 System.out.println("This is method 5 calling.....");
    	 b.method1();
    	 b.method2();
	}

    public int method6(int a, int b) {  
	   	 System.out.println("This is method 6 calling.....");
	   	 int c = a+b;
	   	 return c;
	}

    public void method7(int x, int y) {  
	   	 System.out.println("This is method 7 calling.....");
	   	 System.out.println("The Local Varaibles are :" + x + " & " + y);
	
    }
}

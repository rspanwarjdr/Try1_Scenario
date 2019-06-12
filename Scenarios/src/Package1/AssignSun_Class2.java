package Package1;

import java.util.Scanner;

public class AssignSun_Class2 extends AssignSun_Class1 {
    	
	public static void main(String[] args) {
		
     AssignSun_Class2 obj2 = new AssignSun_Class2();
     AssignSun_Class3 obj3 = new AssignSun_Class3();
     
     obj2.method1();
     obj2.method2();
     
     obj3.method3();
     
     obj3.method5(obj2);
     
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the 1st number : ");
     int a = s.nextInt();
     System.out.println("Enter the 2nd number : ");
     int b = s.nextInt();
     int d = obj3.method6(a,b);
     System.out.println("The sum of 1st and 2nd number : " + d);
     
     System.out.println("Enter the 1st Value : ");
     int k = s.nextInt();
     System.out.println("Enter the 2nd Value : ");
     int l = s.nextInt();
     obj3.method7(k,l);
     
     System.out.println("The Global Varaibles are :" + obj3.x + " & " + obj3.y);
     s.close();
	}
}
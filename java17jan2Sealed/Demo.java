package java17jan2Sealed;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****non-sealed class****");
		ClassB ob1 = new ClassB();
		 ob1.methodA();
		ob1.methodB();
		ob1.dis();
		 System.out.println("****final class****"); ClassC ob2 = new ClassC();
		 ob2.methodA();
		 ob2.methodC();
		 ob2.dis();
		  System.out.println("****non-sealed class****"); ClassE ob3 = new ClassE();
		  ob3.methodA();
		 ob3.methodD();
		 ob3.methodE();
		 ob3.dis();

	}

}

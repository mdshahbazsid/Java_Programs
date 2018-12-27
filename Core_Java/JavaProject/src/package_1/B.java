package package_1;

public class B extends A {

	public B() {
		System.out.println("B");
	}
	public B(int x) {
		System.out.println("B"+x);
	}
	
	public static void main(String arg[]) {
		B obj=new B();
		B obj1=new B(1000);
	}
}

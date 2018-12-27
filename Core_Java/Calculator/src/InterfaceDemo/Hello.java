package InterfaceDemo;

public class Hello {

	public static void main(String[] args) {
		Hello2 obj=new Hello2();
		obj.print();
		
	}

}
class Hello2 implements abc,xyz{
	public void print() {
		xyz.super.print();
	}
}

interface abc{
	default void print() {
		System.out.println("Abc");
	}
}

interface xyz{
	default void print() {
		System.out.println("Xyz");
	}
}
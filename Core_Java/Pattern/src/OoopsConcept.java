class OoopsConcept {

	public static void main(String[] args) {
		OoopsConcept obj=new OoopsConcept();
		obj.area();
		obj.area(2);
		obj.area(5.88);
	}
	
	public void area() {
		System.out.println("Area of circle is 20 mt sq.");
	}
	public void area(int a) {
		System.out.println("Area of circle is 30 mt sq.");
	}
	public void area(int x,double y) {
		System.out.println("Area of rectancle is 20 mt sq.");
	}
	public void area(double y,int x) {
		System.out.println("Area of square is 20 mt sq.");
	}
	public void area(double d) {
		System.out.println("Area of circle is 200 mt sq.");
	}

}



interface abcd{
	public void area(int a);
}


abstract class ghy{
	
	ghy()
	{
		System.out.println("Hello parent");
	}
	public void area(int a) {
		System.out.println("ghy area over");
	}
}

class xyz extends ghy{

	xyz()
	{
		super();
	}
	
	@Override
	public void area(int a) {
		System.out.println("area over");
	}
	public static void main(String args[]) {
		ghy ob=new xyz();
		ob.area(23);
	}
	
}

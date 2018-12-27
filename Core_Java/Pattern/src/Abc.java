
public class Abc implements Ab, Ba {

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		Ba.super.sum();
		
	}
	
public static void main(String args[])
{
	Abc obj=new Abc();
	obj.sum();
	
}
}
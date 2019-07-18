package Inheritance;

//1.Example & use of super keyword in inheritance on methods

public class C  extends B{

	void show(){
		super.show();
		System.out.println("show from C class");
	}
	
	public static void main(String args[])
	{
		C obj=new C();
		obj.show();
		
	}

}

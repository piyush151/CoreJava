
public class First {
	
	void show(int x, int y)
	{
		int z;
		z=x+y;
		System.out.println("z ="+z);
	}
	
	public static void main(String args[])
	{
		
		
		First obj=new First();
		
		obj.show(5, 6);
		//obj.show(6);
	}

}

package String;

public class P2 {

	
	public static void main(String []args)
	{
		
		String s1="101, pen, 500, india";
		System.out.println("INPUT = "+s1);
		
		String f[]=s1.split(",");
		
		int price = Integer.parseInt(f[2]);
		
		String	country=f[3];
		int st=0;
		if(country.equalsIgnoreCase("india"))
		{
			st =(price*5/100);
		}
		
		int fprice = st + price;
	String output = s1+","+st+","+fprice;
	System.out.println("output = "+output);
		
	
	}
	
}

package Inheritance;

public class College {

	int cid;
	String cname;
	
	void setCollege()
	{
		cid=101; cname="IIT";
	}
	
	void setCollege(int a, String b)
	{
		cid=a; cname=b;
	}
	
	void getCollege()
	{
		System.out.println(cid+""+cname);
	}
}

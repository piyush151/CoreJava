package Inheritance;

public class Student extends College {

	int sid;
	String sname;
	

	void setStudent()
	{
		sid=102;
		sname="Alex";
		
	}
	
	void setStudent(int a, String b)
	{
		sid=a;
		sname=b;
	}
	
	void getStudent()
	{
		
		System.out.println(" Sid= "+sid+" Sname= "+sname);
	}

	public static void main(String []args)
	{
		Student s1=new Student();
		s1.setStudent();
		s1.setCollege();
		
		s1.getCollege();
		s1.getStudent();
		
		

	}


}

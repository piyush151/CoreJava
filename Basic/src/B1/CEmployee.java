package B1;

import B1.CEmployee;

public class CEmployee {

	int eid;
	String ename, city;
	double salary;
	
	CEmployee()//default constructor , name must be same as class name
	{
		eid=101; ename="Alex"; salary=20000.00; city="Indore";		
	}
	
	CEmployee(int a, String b, double c, String d)//parameterized constructor
	{
		eid =a; ename=b; salary=c; city=d;
	}
	
	
	void CEmployee()//method name may or may not be same as class name
	{
			System.out.println(" Eid ="+eid+" Eame ="+ename+" Salary ="+salary+" City= "+city);	
	}
	
	
	
	public static void main(String []args) {
		
		CEmployee e1=new CEmployee();
		CEmployee e2=new CEmployee(102,"amit", 25000.00, "Ratlam");
		
		//e1.CEmployee();
		
		e2.CEmployee();
	}

}

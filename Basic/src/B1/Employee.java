package B1;

import B1.Employee;

public class Employee {

	int eid;
	String ename, city;
	double salary;//instance variable: object => new
	
	void setEmployee()//default method
	{
		eid=101; ename="Alex"; salary=20000.00; city="Indore";		
	}
	
	void setEmployee(int a, String b, double c, String d)
	{
		eid =a; ename=b; salary=c; city=d;
	}
	
	
	void getEmployee()
	{
			System.out.println(" Eid ="+eid+" Eame ="+ename+" Salary ="+salary+" City= "+city);	
	}
	
	
	
	public static void main(String []args) {
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.setEmployee();
		e1.getEmployee();
		
		e2.setEmployee(102,"Sam", 15000, "Bhopal");
		e2.getEmployee();
	}

}

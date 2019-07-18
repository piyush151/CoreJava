package B1;

public class Result {

	String showResult(int marks)
	{
		if(marks>=50)
		{
			System.out.println("Pass");
			return "pass";
		}
		
		else
		{
			System.out.println("Fail");
			return "fail";
		}
		
	}
		void showGrades(int marks) {
			
			if(marks>=50 && marks<60)
				System.out.println("Grade  => C");
			
			else if(marks>=60 && marks<80)
				System.out.println("Grade  => B");
			
			else if(marks>=80 && marks<100)
				System.out.println("Grade  => A");
			
		}
		
		void showPercentage(int marks){
			
			System.out.println("Percentage => "+marks+"%");
		}
		
	public static void main(String []args){
		
		Result r=new Result();
		
		int marks=50;
		
		String res=r.showResult(marks);
		
		if(res.equals("pass"))
		{
			r.showGrades(marks);
			r.showPercentage(marks);
		}
		
		
	}
}

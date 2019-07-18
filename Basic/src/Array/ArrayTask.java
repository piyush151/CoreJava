package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTask {
	public static void main(String []args)
	{
		int Scores[]= new int[] {12,19,0,120,45,99,100,44,0,99};
		
	//1)print all scores 
		
		for(int y:Scores)
		{
			System.out.println(y);
		}
		
		System.out.println("<=================================>");
		
	//2)Total score
		
		int total=0;
		
		for(int y:Scores)
			total=total+y;
			System.out.println("Total = "+total);
	
	
	//3)Average score
			System.out.println("Average Score = "+total/Scores.length);
		
	//4)Highhest Score
		
			int max=Scores[0];
			for(int y:Scores)
			{
				if(max<y)
					max=y;
			}
		System.out.println("Highest Score = "+max);
	
	//5)Lowest score
		int min=Scores[0];
		for(int y:Scores)
		{
			if(min>y)
			min=y;
			
		}
		
		System.out.println("Lowest Score = "+min);
		
	//6)No. of Century 
	//7)No. of half Century
	//8)No. of zero
	
	int century=0 , hc=0, zero=0;
		for(int y:Scores)
		{
			if(y>100)
				century++ ;
		
			if(y>=50 && y<100)
				hc++;
			
			if(y==0)
				zero++;
		}
		
		System.out.println("No. of Century = "+century);
		System.out.println("No. of Half Century = "+hc);
		System.out.println("No. of Zero = "+zero);
		
	//9)Highest score index=3
		for(int i=0; i<Scores.length; i++)
		{
			if(Scores[i]==max)
			{
				System.out.println("Highest Score index = "+i);
				break;
			}
	
		}
		
	//10)Sorting
		System.out.println("<================Sorted==================>");
		Arrays.sort(Scores);
		for(int y:Scores)
		System.out.println(y);
		
	}
}

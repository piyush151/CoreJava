package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Task {

	public static void main(String []args)
	{
		String data="";
		try(FileReader fr=new FileReader("input.csv"); 
			BufferedReader br=new BufferedReader(fr);	
			)
		{ 
			String x;
			FileWriter fw=new FileWriter("output.csv");
			BufferedWriter bw=new BufferedWriter(fw);
			
			while((x=br.readLine())!=null) {
				
				data=x;
				
				String[] values = (data.split(","));
				int totaltax=0;
				
				int third = Integer.parseInt(values[2]);
				System.out.println(data);
				
								
				if(values[3].contains("india"))
				{
					totaltax = third*5/100; //25
					third = totaltax + third ;
						
					bw.write(data+","+totaltax+","+third);
					bw.flush();
					bw.newLine();
				}
				
				else if(values[3].contains("china"))
					
				{
					totaltax = third*10/100; 
					third = totaltax + third ;
					
					bw.write(data+","+totaltax+","+third);
					bw.flush();
					bw.newLine();
				}
				
				else if(values[3].contains("italy"))
				{
					totaltax = third*15/100; 
					third = totaltax + third ;
					
					bw.write(data+","+totaltax+","+third);
					bw.flush();
					bw.newLine();
				}
				
				else if(values[3].contains("america"))
				{
					totaltax = third*20/100; 
					third = totaltax + third ;
					
					bw.write(data+","+totaltax+","+third);
					bw.flush();
					bw.newLine();
				}
				
			else {
						System.out.println("not exist");
				}
				
			}
			
		}catch(Exception e) 
		{
			System.out.println(e);
		}
		
	}
}

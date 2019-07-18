package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FUTask {
	
	void filereadWrite(String infile, String outfile)
	{
		
		try(FileReader fr=new FileReader(infile); 
			BufferedReader br=new BufferedReader(fr);	
				FileWriter fw=new FileWriter(outfile);
				BufferedWriter bw=new BufferedWriter(fw);
	
			)
		{ 
			String data;
			String x;
			int totaltax=0, price; 
			int tax;
			while((x=br.readLine())!=null) {
				
				data=x;
				
				String[] values = (data.split(","));
				price = Integer.parseInt(values[2]);
				System.out.println(data);
				
								
				if(values[3].contains("india"))
				{
					tax=5;
					int	finaltax=staxCal(price,tax);		
						System.out.println(finaltax);		
						
					int finalprice = finaltax + price;
						
							
					bw.write(data+","+finaltax+","+finalprice);
					bw.flush();
					bw.newLine();
				}
				
				else if(values[3].contains("china"))
					
				{
					tax=10;
					int	finaltax=staxCal(price,tax);		
						System.out.println(finaltax);		
						
					int finalprice = finaltax + price;
					
					bw.write(data+","+finaltax+","+finalprice);
					bw.flush();
					bw.newLine();
				}
				
				else if(values[3].contains("italy"))
				{
					tax=15;
					int	finaltax=staxCal(price,tax);		
						System.out.println(finaltax);		
						
					int finalprice = finaltax + price;
					
					bw.write(data+","+finaltax+","+finalprice);
					bw.flush();
					bw.newLine();
				}
				
				else if(values[3].contains("america"))
				{
					tax=20;
					int	finaltax=staxCal(price,tax);		
						System.out.println(finaltax);		
						
					int finalprice = finaltax + price;
					
					bw.write(data+","+finaltax+","+finalprice);
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
	
	
		
	static int staxCal(int price, int tax){
		
		int totaltax=price*tax/100;
		return totaltax;
		
	}
		
		
		
		
		
		boolean checkExistance(String infile){
				boolean b=false;
				File f=new File(infile);
				if(f.exists())
					b=true;
				return b;
			}
		
	
		
	public static void main(String []args)
	{
		FUTask obj =new FUTask();
		String outfile="out.csv";
		String infile="in.csv";
		
		if(obj.checkExistance(infile)==true)
			obj.filereadWrite(infile, outfile);
	}
}

package Inheritance;

//2.Example & use of super keyword in inheritance on instance variable


public class BDemo extends ADemo {
		int x=200;
		void show(int x){
			
			System.out.println(x);//300
			System.out.println(this.x);//200
			System.out.println(super.x);//100
		}
	
	public static void main(String []args){
		
		BDemo obj=new BDemo();
		obj.show(300);
		
	}
	
}

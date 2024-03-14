import java.util.*;
class Hesco3{
	
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
	
		
			System.out.print("Enter units?");
		    int units=ob.nextInt();
			int value=0;
           
		    if(units>=1 && units<=100)
				value = units*2;
			System.out.println("20*2="+40);
			if(units >= 101 && units<=200){
				value = (100*2)+(units- 100)*4;
			System.out.println("100*2="+200);
			System.out.println("20*4="+80);
			}
			if(units>=201 && units<=300){
				value = (100*2)+(100*4)+ (units - 200)*6;
			System.out.println("100*2="+200);
			System.out.println("100*4="+400);
			System.out.println("20*6="+120);
			}
			if(units>=301 && units<=400){
				value =(100*2)+(100*4)+(100*6)+(units - 300)*8;
			System.out.println("100*2="+200);
			System.out.println("100*4="+400);
			System.out.println("100*6="+600);
			System.out.println("20*8="+160);
			}
			if(units > 400){
				 value=(100*2)+(100*4)+(100*6)+(100*8)+(units - 400) * 10;
			System.out.println("100*2="+200);
			System.out.println("100*4="+400);
			System.out.println("100*6="+600);
			System.out.println("100*8="+800);
			System.out.println("20*10="+200);
			}
			
			
			System.out.print("Net bill="+ value);
	}	
	
}
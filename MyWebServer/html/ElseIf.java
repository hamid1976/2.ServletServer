import java.util.*;
class 	ElseIf{

    public static void main(String arg[]){
	
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Percentage?");
		int Percentage=ob.nextInt();
		
		
	
		
			
			if(Percentage >=90){
				if(Percentage <=100){
					System.out.print("A1");
				}
			}
			else
			if(Percentage >=80){
				if(Percentage <90){
					System.out.print("A");
				}
			}
			else
			if(Percentage >=70){
				if(Percentage <80){
					System.out.print("B");
				}
			}
			else
				if(Percentage >=60){
				if(Percentage <70){
					System.out.print("c");
				}
				}
				else
				if(Percentage >=50){
				if(Percentage <60){
					System.out.print("d");
				}
				}
				else
				if(Percentage >=40){
				if(Percentage <50){
					System.out.print("e");
					
				}
				}
				else
				if(Percentage <=39){
					System.out.print("Fail");
					
				}
				
				
				
			
			
	}
}		
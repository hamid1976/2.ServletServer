import java.util.Scanner;
class W4_E3_Character{
	public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter character: ");
		char ch = ob.next().charAt(0);
			
			if(ch>=97 && ch<=122){
				System.out.println("Input Character: "+ch);
				System.out.println("'"+ch+"'"+" is alphabat");
			}
			
			if(ch>=65 && ch<=90){
				System.out.println("Input Character: "+ch);
				System.out.println("'"+ch+"'"+" is alphabat");
			}
			
			if(ch>=33 && ch<=47){
				System.out.println("Input Character: "+ch);
				System.out.println("'"+ch+"'"+" is special character");
			}
			
			if(ch>=48 && ch<=57){ //for 0 to 9
				System.out.println("Input Character: "+ch);
				System.out.println("'"+ch+"'"+" is number");
			}
	}
}
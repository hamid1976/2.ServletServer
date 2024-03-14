import java.util.Scanner;
class VariableCouter{
	public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter sentence: ");
		String data = ob.nextLine();
		System.out.print("Enter sentence: ");
		char choice = ob.next().charAt(0);
		
		int counter=0;
		for(int i=0; i<=data.length()-1; i++){
				if(data.charAt(i)==choice){
					counter++;
				}
		}
			System.out.println(data);
			System.out.println(choice+"  =  "+counter);
	}
}
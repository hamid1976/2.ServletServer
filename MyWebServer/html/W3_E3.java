import java.util.Scanner;
class W3_E3{
	public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
			System.out.println("Enter number: ");
			int value = ob.nextInt();
			System.out.println("Nmber : " + value + "  Convert To Binary is : " + Integer.toBinaryString(value));
	}
}
import java.util.Scanner;
class W2_E2Find_Max_Min{
	public static void main(String arg[]){
		Scanner ob = new Scanner (System.in);
		 int data[] = {10,2,30,400,50};
			for(int i=0; i<data.length-1; i++){
				if(data[i] > data[i+1]){
					int temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;
				}
			}
			System.out.println("Largest no is: " +data[data.length-1]);
			
			for(int i=0; i<data.length-1; i++){
				if(data[i] < data[i+1]){
					int temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;
				}
			}
			System.out.println("Smallest no is: " +data[data.length-1]);
	}
}
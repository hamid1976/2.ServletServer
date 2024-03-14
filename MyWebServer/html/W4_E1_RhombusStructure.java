import java.util.*;
class W4_E1_RhombusStructure{
	public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
        System.out.println("Input the number: ");
        int num = ob.nextInt();
        int count = 1;
        int count2 = 1;
        char c = 'A';

        for (int i = 1; i < (num * 2); i++) 
        {
            for (int spc = num - count2; spc > 0; spc--)   
            //print space
            {
                System.out.print(" ");
            }
            if (i < num) 
            {
                count2++;
            } 
            else 
            {
                count2--;
            }
            for (int j = 0; j < count; j++) 
            {
                System.out.print(c);//print Character
                if (j < count / 2) 
                {
                    c++;
                } else 
                {
                    c--;
                }
            }
            if (i < num)
            {
                count = count + 2;
            } 
            else
            {
                count = count - 2;
            }
            c = 'A';

            System.out.println();
        }
	}
}
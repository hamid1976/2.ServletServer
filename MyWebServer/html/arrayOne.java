import java.util.Scanner;
public class arrayOne
{
    public static void main(String args[] )
    { 
        int balance = 5000, add, deposit;
		
        Scanner s = new Scanner(System.in);
        while(true)
        {
System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for add");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                add = s.nextInt();
                balance=balance+add;
				
                System.out.println("");
                break;
 
                case 2:
				System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
				if (balance<=5000){
	System.out.println("Your Money has been successfully depsited");}
	
else{System.out.println("Your Money has been unsccessfully depsited");}
                balance = balance - deposit;
				if(deposit>5000)
                System.out.println("your balance is invalid");
              //  System.out.println(" ");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
            }
        }
    }
}
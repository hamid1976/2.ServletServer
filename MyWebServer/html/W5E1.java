import java.util.Scanner;

class W5E1{
	public static void main(String[] args){
		Course course = new Course();
	}
}

class Course{
	private String courseName;
	private char letterGrade;

	Course(){
		takeInput();
		display();
	}
	
	public void takeInput(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Course name: ");
		courseName = sc.nextLine();
		
		while(true){
			System.out.print("Enter the Grade: ");
			letterGrade = sc.next().charAt(0);
		
			if(letterGrade == 'a' || letterGrade == 'b' || letterGrade == 'c' || letterGrade == 'd' || letterGrade == 'f' ||
			   letterGrade == 'A' || letterGrade == 'B' || letterGrade == 'C' || letterGrade == 'D' || letterGrade == 'F')
				break;
			System.out.println("INVALID INPUT");	
		}
	}

	public void display(){
		System.out.println("Course Name: "+courseName);
		System.out.println("Grade: "+letterGrade);
	}
}
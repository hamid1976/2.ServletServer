import java.util.Scanner;
class Test{
	String course;
	char grade;
	Test(String course,char grade){
		this.course = course;
		this.grade = grade;
	}
	public void show(){
		System.out.println("Course: "+course);
		System.out.println("Grade: "+condition(grade));
	}
	private char condition(char grade){
		if(grade == 'a' || grade == 'b' || grade == 'c' || grade == 'd' || grade == 'f' || 
		   grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F'){
			return grade;
		   }
		 else{
			 return 'I';
		 }
	}
}
class W5_E1{	
	public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter Cource name: ");
		String course = ob.nextLine();
		
		System.out.print("Enter Grade: ");
		char grade = ob.next().charAt(0);
		
		Test obj = new Test(course,grade);
		obj.show();
	}
}
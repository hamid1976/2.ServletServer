import java.util.Scanner;
class Week6{
	public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
		int i,j,k,l,m,n,o,p;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;
		int total = 500;
		//rollNo
		System.out.println("Enter Students Roll no: ");
		int rollNo[] = new int[5];
		for (i=0; i<rollNo.length; i++){
			System.out.print("2K19/SWE/");
			rollNo[i] = ob.nextInt();
		}
		//name
		System.out.println();
		System.out.println("Enter Students Name: ");
		String name[] = new String[5];
		for (j=0; j<name.length; j++){
			System.out.print("Name " + j+": ");
			name[j] = ob.next();
		}
		//marks of student no 1:
		System.out.println();
		System.out.println("Enter marks of " + name[0]);
		int marks1[] = new int[5];
		for (k=0; k<marks1.length; k++){
			System.out.print("Subject" + k+": ");
			marks1[k] = ob.nextInt();
		}
		// total marks of student no 1:
			for(int total1=0; total1 < 5; total1++)
			sum1 += marks1[total1];
					
		//marks of student no 2:
		System.out.println();
		System.out.println("Enter marks of " + name[1]);
		int marks2[] = new int[5];
		for (l=0; l<marks2.length; l++){
			System.out.print("Subject" + l+": ");
			marks2[l] = ob.nextInt();
		}
		// total marks of student no 2:
			for(int total2=0; total2 < 5; total2++)
			sum2 += marks2[total2];
						
		//marks of student no 3:
		System.out.println();
		System.out.println("Enter marks of " + name[2]);
		int marks3[] = new int[5];
		for (m=0; m<marks3.length; m++){
			System.out.print("Subject" + m+": ");
			marks3[m] = ob.nextInt();
		}
		// total marks of student no 3:
			for(int total3=0; total3 < 5; total3++)
			sum3 += marks3[total3];
						
		//marks of student no 4:
		System.out.println();
		System.out.println("Enter marks of " + name[3]);
		int marks4[] = new int[5];
		for (n=0; n<marks4.length; n++){
			System.out.print("Subject" + n+": ");
			marks4[n] = ob.nextInt();
		}
		// total marks of student no 4:
			for(int total4=0; total4 < 5; total4++)
			sum4 += marks4[total4];
						
		//marks of student no 5:
		System.out.println();
		System.out.println("Enter marks of " + name[4]);
		int marks5[] = new int[5];
		for (o=0; o<marks5.length; o++){
			System.out.print("Subject" + o+": ");
			marks5[o] = ob.nextInt();
		}	
		// total marks of student no 5:
			for(int total5=0; total5 < 5; total5++)
			sum5 += marks5[total5];
		
		System.out.println();
		// for total marks
		int totalMarks[] = {sum1,sum2,sum3,sum4,sum5};	
		

		System.out.println();
		//for percentage
		double percentage[] = {sum1,sum2,sum3,sum4,sum5};
		for ( int q=0; q<percentage.length; q++){
			percentage[q] = percentage[q]*100/total;	
		}
		
		//for grade...
		String grade[] = new String[5];
		 for(int g=0; g<grade.length; g++){
		    if( percentage[g]>=20 && percentage[g]<=40){
				grade[g]="C";
			}
			if( percentage[g]>=40 && percentage[g]<=50){
				grade[g]="D";
			}
			if( percentage[g]>=50 && percentage[g]<=65){
				grade[g]="B";
			}
			if( percentage[g]>=65 && percentage[g]<=75){
				grade[g]="A";
			}
			if( percentage[g]>=75 && percentage[g]<=100){
				grade[g]="A1";
			}	
		 }
		
		
		//reall output...
		//All students Result
	
		for (int t1=0; t1<5; t1++){
			//System.out.println("t1 : " + t1);
			System.out.println("Roll No: " + "2K19/SWE/"+rollNo[t1]);
			System.out.println("Name of Student: " + name[t1]);
		for (int t2=0; t2<5; t2++){
			//System.out.println("t2 : " + t2);
		if( t1 == 0){
			if( t2 == 0){
				System.out.println("English: " + marks1[t2]);
			}
			else if( t2 == 1){
				System.out.println("Calculus: "+ marks1[t2]);
			}
			else if( t2 == 2){
				System.out.println("Electronics: "+ marks1[t2]);
			}
			else if( t2 == 3){
				System.out.println("Programming: "+ marks1[t2]);
			}
			else if( t2 == 4){
				System.out.println("Intro To IT: "+ marks1[t2]);
			}
		}
		else if( t1 == 1){
			if( t2 == 0){
				System.out.println("English: " + marks2[t2]);
			}
			else if( t2 == 1){
				System.out.println("Calculus: "+ marks2[t2]);
			}
			else if( t2 == 2){
				System.out.println("Electronics: "+ marks2[t2]);
			}
			else if( t2 == 3){
				System.out.println("Programming: "+ marks2[t2]);
			}
			else if( t2 == 4){
				System.out.println("Intro To IT: "+ marks2[t2]);
			}
		}
		else if( t1 == 2){
			if( t2 == 0){
				System.out.println("English: " + marks3[t2]);
			}
			else if( t2 == 1){
				System.out.println("Calculus: "+ marks3[t2]);
			}
			else if( t2 == 2){
				System.out.println("Electronics: "+ marks3[t2]);
			}
			else if( t2 == 3){
				System.out.println("Programming: "+ marks3[t2]);
			}
			else if( t2 == 4){
				System.out.println("Intro To IT: "+ marks3[t2]);
			}
		}
		else if( t1 == 3){
			if( t2 == 0){
				System.out.println("English: " + marks4[t2]);
			}
			else if( t2 == 1){
				System.out.println("Calculus: "+ marks4[t2]);
			}
			else if( t2 == 2){
				System.out.println("Electronics: "+ marks4[t2]);
			}
			else if( t2 == 3){
				System.out.println("Programming: "+ marks4[t2]);
			}
			else if( t2 == 4){
				System.out.println("Intro To IT: "+ marks4[t2]);
			}
		}
		else if( t1 == 4){
			if( t2 == 0){
				System.out.println("English: " + marks5[t2]);
			}
			else if( t2 == 1){
				System.out.println("Calculus: "+ marks5[t2]);
			}
			else if( t2 == 2){
				System.out.println("Electronics: "+ marks5[t2]);
			}
			else if( t2 == 3){
				System.out.println("Programming: "+ marks5[t2]);
			}
			else if( t2 == 4){
				System.out.println("Intro To IT: "+ marks5[t2]);
			}
		}
	}// end of for
		
			System.out.println("Total: "+ totalMarks[t1]);
			System.out.println("Percentage: "+percentage[t1]+" %");
			System.out.println("Grade: " + grade[t1]);
			System.out.println();
			System.out.println();
	} //end of for
	
		
	}//end of class
}//end of method
import javax.swing.*;
class subProgram{
	static void marksheet(){
		int total=500;
						String marks1 = JOptionPane.showInputDialog("Enter java marks: ");
						int java=Integer.parseInt(marks1);
						
						String marks2 = JOptionPane.showInputDialog("Enter C++ marks: ");
						int cpp=Integer.parseInt(marks2);
						
						String marks3 = JOptionPane.showInputDialog("Enter PhP marks: ");
						int php=Integer.parseInt(marks3);
						
						String marks4 = JOptionPane.showInputDialog("Enter Oracle marks: ");
						int oracle=Integer.parseInt(marks4);
						
						String marks5 = JOptionPane.showInputDialog("Enter Cobol marks: ");
						int cobol=Integer.parseInt(marks5);
						
						int obtain=(java+cpp+php+oracle+cobol);
						int percentage=obtain*100/total;
						JOptionPane.showMessageDialog(null,"      Marksheet"+
													"\njava marks:  " + java+
													"\nC++ marks:  " + cpp+
													"\nPhP marks:  " + php+
													"\nOracle marks:  " + oracle+
													"\nCobol marks:  " + cobol+
													"\n\nTotal marks= " + total+
													"\nObtain marks= " +obtain+
													"\nPercentage= "+ percentage+" %");
	}// end of marksheet
	static void unitConverter(){
		int selectionUnit=0;
					do{
					String s2 = JOptionPane.showInputDialog("1.  Minutes to Hours "+
					 "\n"+ "2.  Day To Months"+
					 "\n"+ "3. Celsius to Fahrenheit "+
					 "\n"+ "4. Fahrenheit to Celsius"+
					 "\n"+ "5. Back");
		
					selectionUnit=Integer.parseInt(s2);
				
							switch(selectionUnit){
							case 1:	//minTohour
									String min = JOptionPane.showInputDialog("Enter minutes: ");
									int a=Integer.parseInt(min);
									int minTohour=a/60;
									JOptionPane.showMessageDialog(null,"Hours : "+minTohour);
									break;

							case 2:// dayTomonth
									String day = JOptionPane.showInputDialog("Enter Days: ");
									int c=Integer.parseInt(day);
									int dayTomonth=c/30;
									JOptionPane.showMessageDialog(null,"Months : "+dayTomonth);
									break;
							
							case 3://sTof
									String s = JOptionPane.showInputDialog("Enter Celsius: ");
									int num1=Integer.parseInt(s);
									int sTof=((num1*9/5)+32);
									JOptionPane.showMessageDialog(null,"Fahrenheit : "+sTof+" F");
									break;
								
							case 4://fTos
									String f = JOptionPane.showInputDialog("Enter Fahrenheit: ");
									float num2=Float.parseFloat(f);
									float fTos=((num2-32)*0.55f);
									JOptionPane.showMessageDialog(null,"Celsius : "+fTos+ " C");
									break;
						
							// default: JOptionPane.showMessageDialog(null,"Invalid Selection");
									 // break;
							}// end of selectionUnit
					}while(selectionUnit!=5);
	}
	
}
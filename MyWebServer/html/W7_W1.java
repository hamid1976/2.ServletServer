import javax.swing.*;
class W7_W1{
	public static void main(String arg[]){
		do{
		String s1 = JOptionPane.showInputDialog("1.  Unit Converter\n2.  Mark Sheet\n3.  Exit");
		int selectionAll = Integer.parseInt(s1);
		
	
		switch(selectionAll){
			case 1: //unit converter
					subProgram.unitConverter();
					break;

			case 2: //Mark Sheet 
					subProgram.marksheet();
					break;
			
			
			case 3: //exit
					JOptionPane.showMessageDialog(null,"GOOD BYE.....");
					System.exit(0);
					break;
		
			}//end of selectionAll
			
		}while(true);//end of while
		
		
	}//end of method
}//end of class

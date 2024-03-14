class W5_E3{
	static void Number(String no){
		if(no.contains("+92-0")){
			String temp = no.replaceAll("-","");
			String convert = temp.replace("+920","+92");
			javax.swing.JOptionPane.showMessageDialog(null,"Number: "+convert);
		}
		else{
			javax.swing.JOptionPane.showMessageDialog(null,"Invalid Number...");
		}
	}
	public static void main(String arg[]){
		W5_E3.Number(javax.swing.JOptionPane.showInputDialog("Enter CellPhone number :"));
	}
}
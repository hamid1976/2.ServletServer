class W5_E2{
	static void URL(String url){
		if(url.toLowerCase().contains("www.") && url.toLowerCase().contains(".com")){
			String temp = url.toLowerCase().replace("www.","");
			String convert = temp.toLowerCase().replace(".com","");
			javax.swing.JOptionPane.showMessageDialog(null,"URL: "+convert);
		}
		else{
			javax.swing.JOptionPane.showMessageDialog(null,"Invalid URL...");
		}
	}
	public static void main(String arg[]){
		W5_E2.URL(javax.swing.JOptionPane.showInputDialog("Enter Commercial website Url:"));
	}
}
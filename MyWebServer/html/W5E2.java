import java.util.Scanner;
class W5E2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any website: ");
		String web = sc.nextLine();
		
		String webName = web.substring(web.indexOf('.')+1,web.indexOf(".com"));
		System.out.print(webName);
	}
}
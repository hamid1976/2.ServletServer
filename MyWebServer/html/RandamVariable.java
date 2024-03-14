class RandamVariable{
	public static void main(String arg[]){
		// java.util.Random r = new java.util.Random();
		// for(int i = 1; i<=100; i++){
			// int data[] = new int[ r.nextInt(i)];
			// System.out.println(data.length);
		// }
		String set = "I am string object";
		System.out.println("length: " + set.length());
		System.out.println("Upper case: " + set.toUpperCase());
		System.out.println("Index of s: "+set.indexOf("m"));
		set = new String("new String");
		System.out.println(set);
	}
}
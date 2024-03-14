abstract class Animal{
	abstract void sound();
	void leg(){
		System.out.println(" 4 legs");
	}
	void eye(){
		System.out.println("2 eyes");
	}
}
class cat extends Animal{
	void sound(){
		System.out.println("miawooo...");
	}
}
class human extends Animal{
	void leg(){
		System.out.println(" 2 legs");
	}
	void sound(){
		System.out.println("spoken Language..");
	}
}
class Display{
	static void show(Animal a){
	a.sound();
	a.leg();
	a.eye();
	}
}
class TestInteface{
	public static void main(String arg[]){
		cat c = new cat();
		human h = new human();
		Display.show(c);
		Display.show(h);
	}
}
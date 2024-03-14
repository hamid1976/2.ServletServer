abstract class Animal{
	abstract void sound();
	void legs(){
		System.out.println("4 legs..");
	}
	void eyes(){
		System.out.println("2 eyes..");
	}
}
class Cat extends Animal{
	void sound(){
		System.out.println("Miawoo..");
	}
}
class Human extends Animal{
	void sound(){
		System.out.println("Spoken Language..");
	}
	void legs(){
		System.out.println("2 legs..");
	}
}
class Display{
	static void show(Animal a){
		a.sound();
		a.eyes();
		a.legs();
	}
}
class TestAbstact{
	public static void main(String arg[]){
		Cat c = new Cat();
		Human h = new Human();
		
		Display.show(c);
		Display.show(h);
	}
}
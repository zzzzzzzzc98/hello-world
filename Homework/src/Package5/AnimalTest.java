package Package5;

public class AnimalTest {
	public static void main(String []args) {
		Animal a;
		Pet p;
		a = new Spider();
		a.walk();
		a.eat();
	
		a = new Cat();
		a.walk();
		a.eat();
		
		a = new Fish();
		a.walk();
		a.eat();
		
		p = new Fish();
		p.setName("Dolly");
		System.out.println(p.getName());
		p.play();
		
		
	}
}

package Package3;

public class Zoo {
	public static void main(String[] args) {
		Animal a = new Animal("Cat",4);
		a.move();
		a.move(3);
		Fish f = new Fish("Dorry");
		f.move();
		Bird b = new Bird("JiJi");
		b.move();
		Animal af = new Fish("Papa");
		af.move(3);
	}
}

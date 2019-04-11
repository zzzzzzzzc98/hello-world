package Package5;

public abstract class Animal {
	protected int legs;
	public Animal(int legs) {
		this.legs = legs;
	}
	public void walk() {
		System.out.println("Animal is walking");
	}
	public abstract void eat();
}

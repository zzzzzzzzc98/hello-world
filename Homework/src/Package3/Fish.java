package Package3;

public class Fish extends Animal {
	private String name;
	private int legs;
	public Fish(String name) {
		this.name = name;
		this.legs = 0;
	}
	public void move() {
		System.out.println("Fish is Swimming!!");
	}
}

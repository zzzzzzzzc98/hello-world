package Package3;

public class Bird extends Animal {
	private String name;
	private int legs;
	public Bird(String name) {
		this.name = name;
		this.legs = 2;
	}
	public void move() {
		System.out.println("Bird is Flying!!");
	}
}

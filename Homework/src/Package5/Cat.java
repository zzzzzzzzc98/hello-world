package Package5;

public class Cat extends Animal implements Pet {
	private String name;
	public Cat(String name) {
		super(4);
		this.name = name;
	}
	
	public Cat() {
		super(4);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void play() {
		System.out.println("Cat is playing");
	}
	
	public void eat() {
		System.out.println("Cat is eating fishing");
	}
}

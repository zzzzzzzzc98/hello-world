package Package5;

public class Fish extends Animal implements Pet {
	private String name;
	public Fish() {
		super(0);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void play() {
		System.out.println("Fish is playing!");
	}
	
	public void walk() {
		System.out.println("Fish is walking");
	}
	
	public void eat() {
		System.out.println("Fish is eating");
	}
}

package Package3;

public class Animal {
	private String name;
	private int legs;
	public Animal(){
		this.name = "AAA";
		this.legs = 4;
	}
	public Animal(String name,int legs) {
		this.name = name;
		this.legs = legs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public void move() {
		System.out.println(name+" Moving!!");
	}
	public void move(int n) {
		int i = 1;
		while(i <= n) {
			System.out.println(name+" Moving!!");
			i++;
		}
	}
}

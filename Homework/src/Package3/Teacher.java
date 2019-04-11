package Package3;

public class Teacher {
	public String name;
	public int age;
	public double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary() {
		this.salary = salary;
	}
	public Teacher() {
		
	}
	public Teacher(String name,int age,double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public void addSalary() {
		this.salary += 5000;
	}
}

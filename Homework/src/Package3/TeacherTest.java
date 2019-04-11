package Package3;

public class TeacherTest {
	public static void main(String[] args) {
		Teacher te = new Teacher();
		te.age = 19;
		te.name = "ZhaoZichun";
		te.salary = 5000;
		System.out.println(te.age);
		System.out.println(te.name);
		System.out.println(te.salary);
		te.addSalary();
		System.out.println(te.salary);
	}
}

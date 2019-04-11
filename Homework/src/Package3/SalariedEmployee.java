package Package3;

public class SalariedEmployee extends Employee {
	private double monthSalary;
	public SalariedEmployee(String name,int month,double monthSalary) {
		super(name,month);
		this.monthSalary = monthSalary;
	}
	public double getSalary(int month) {
		return monthSalary + super.getSalary(month);
	}
}
	
package Package3;

public class SalesEmployee extends Employee{
	private double salesCount;
	private double rate;
	public SalesEmployee(String name, int month, double salesCount, double rate) {
		super(name,month);
		this.salesCount = salesCount;
		this.rate = rate;
	}
	public double getSalary(int month) {
		return salesCount * rate + super.getSalary(month);
	}
}
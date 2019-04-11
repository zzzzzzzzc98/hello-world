package Package3;

public class BasedPlusSalesEmployee extends SalesEmployee{
	private double basedPlus;
	public BasedPlusSalesEmployee(String name,int month, double salesCount, double rate, double basedPlus){
		super(name,month,salesCount, rate);
		this.basedPlus = basedPlus;
	}
	public double getSalary(int month) {
		return basedPlus + super.getSalary(month);
	}
}
	
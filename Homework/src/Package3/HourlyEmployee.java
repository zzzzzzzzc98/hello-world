package Package3;

public class HourlyEmployee extends Employee {
	private int hours;
	private double hourSalary;
	public HourlyEmployee(String name,int month,int hours,double hourSalary) {
		super(name,month);
		this.hours=hours;
		this.hourSalary=hourSalary;
	}
	public double getSalary(int month){
		double result;
		if(hours<=160){
			result=hours*hourSalary;
		}else{
			result=160*hourSalary+(hours-160)*1.5*hourSalary;
		}
		return result+super.getSalary(month);
	}

}

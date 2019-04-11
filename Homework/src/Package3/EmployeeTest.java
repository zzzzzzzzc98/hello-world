package Package3;

public class EmployeeTest{
	public static void main(String[] args){
		Employee[] e=new Employee[4];
		e[0]=new SalariedEmployee("zhangsan",9,3222.90);
		e[1]=new HourlyEmployee("lisi",5,230,23.90);
    	e[2]=new SalesEmployee("wangwu",11,2330000.0,0.005);
		e[3]=new BasedPlusSalesEmployee("zhaoliu",2,2000000.0,0.0001,3200.0);
		for(int i=0;i<e.length;i++){
			System.out.println(e[i].getName()+" "+"9月份的工资总额为："+e[i].getSalary(9));
		}
	}
}

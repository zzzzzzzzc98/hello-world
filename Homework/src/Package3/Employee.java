package Package3;

public class Employee {
		private String name;
		private int month;
		public Employee(String name, int month) {
			this.name = name;
			this.month = month;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			this.month = month;
		}
		public double getSalary(int month) {
			if(this.month == month)
				return 100.0;
			return 0.0;
		}
		
}



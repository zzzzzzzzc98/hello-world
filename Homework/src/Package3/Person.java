package Package3;

public class Person {
	public String name;
	public int age;
	public boolean gender;//true is male;false is female
	Person partner;
		public Person(String name,int age,boolean gender,Person partner) {
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.partner = partner;
		}
		public void marry(Person p) {
			if(this.gender == p.gender) {
				System.out.println("同性还不能结婚");
				return;
			}
			if((this.gender == true && this.age < 24) || (this.gender == false && this.age <22) 
					|| (p.gender == true && p.age < 24) || (p.gender == false && p.age <22)) {
				System.out.println("未到结婚年龄");
				return;
			}
			if(this.partner != null||p.partner != null){
				System.out.println("有谁结婚了不行");
				return;
			}
			System.out.println("恭喜"+this.name+"和"+p.name+"结婚");
			this.partner = p;
			p.partner = this;
		}
		public static void main(String[] args){
			Person p1 = new Person("卢本伟",24,true,null);
			Person p2 = new Person("刘谋",26,true,null);
			Person p3 = new Person("UU",24,false,null);
			
			p1.marry(p2);
			p1.marry(p3);
		}
}
package Package5;

public class ParentTset {
	public static void main(String []args) {
		Son son = new Son(5);
		Parent pa = new Parent();
		Parent pb = new Parent();
		pa.setPa(3);
		pb.setPb(4);
		//son.setSc(5);
		int Sum;
		Sum = pa.getPa()+pb.getPb()+son.getSc();
		System.out.println(Sum);	
	}
}

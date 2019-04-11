package Package9;

public class DivisionByZero 
{
	public static void Division(){
		int a = 10;
		int b = 0;
		try{
			System.out.println(a + "/" + b + "=" + (a/b));
		}catch(ArithmeticException e){
			System.out.println("dealt with e");
		}finally{
			System.out.println("finally done");
		}
		System.out.println("returning from devision");
	}
	public static void main(String[] args){
		new DivisionByZero().Division();
			 System.out.println("Returning from main.");
	}
}

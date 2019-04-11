package Package2;

public class Chapter5 {
	public static void main(String[] args){ 
		double result = 0;
		for (int i=0; i<50; i++) 
		{
			result += (i%2==0?1:-1) / ((i*2+1)*1.0);
		}
	System.out.println(result);
	}
}

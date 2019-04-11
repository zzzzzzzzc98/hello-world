package Package2;

public class Chapter6 {
	public static void main(String args[]){
		double result = 0;
		int i=0;
		while((1/ ((i*2+1)*1.0))>=1e-5)
		{
			result += (i%2==0?1:-1) / ((i*2+1)*1.0);
			i++;
		}
		result += (i%2==0?1:-1) / ((i*2+1)*1.0);
	System.out.println(result);
	}
}

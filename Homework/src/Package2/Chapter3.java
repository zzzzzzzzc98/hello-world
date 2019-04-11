package Package2;

public class Chapter3 {
	public static void main(String[] args){
		double p=0;
		double n=1; 
		while(p<=3.1415||p>=3.1416){
			p-=(4/(2*n-1))*(Math.pow(-1,n)); 
			n++;
		}
	System.out.println("Ô²ÖÜÂÊÊÇ£º"+p); 
	System.out.println(n);
	} 
}

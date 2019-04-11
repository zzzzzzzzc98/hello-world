package Package2;

import java.util.Scanner;

public class Chapter4 {
	public static void main(String[] args){
		int n;
		int n1 = 1;
		int n2 = 1;
		int n3 = 0;
		Scanner stdin = new Scanner(System.in);
		n = stdin.nextInt();
		for(int i = 2;i < n;i++)
		{	
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		System.out.println(n3);
	}
}

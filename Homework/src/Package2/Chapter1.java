package Package2;

import java.util.Scanner;

public class Chapter1 {
	public static void main(String[] args){
		boolean flag;
		int testa;
		int testb;
		Scanner stdin = new Scanner(System.in);
		System.out.println("输入第一个数据：");
		testa = stdin.nextInt();
		System.out.println("输入第二个数据：");
		testb = stdin.nextInt();
		flag = testa > testb;
		System.out.println(testa + ">" +testb + ":" +flag);
		flag = testa < testb;
		System.out.println(testa + "<" +testb + ":" +flag);
		flag = testa == testb;
		System.out.println(testa + "=" +testb + ":" +flag);
	}
}

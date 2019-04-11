package Package2;

import java.util.Scanner;

public class Chapter2 {
	public static void main(String[] args){
		int grade;
		Scanner stdin = new Scanner(System.in);
		grade = stdin.nextInt();
		switch(grade/10){
		case 10:
				System.out.println("A");
			break;
		case 9:
				System.out.println("A");
			break;
		case 8:
				System.out.println("B");
			break;
		case 7:
				System.out.println("C");
			break;
		case 6:
				System.out.println("D");
			break;
		case 5:
				System.out.println("E");
			break;
		case 4:
				System.out.println("E");
			break;
		case 3:
				System.out.println("E");
			break;
		case 2:
				System.out.println("E");
			break;
		case 1:
				System.out.println("E");
			break;
		case 0:
				System.out.println("E");
			break;
		default:
			break;
		}
	}
}

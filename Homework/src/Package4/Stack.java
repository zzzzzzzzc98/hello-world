package Package4;

public class Stack {
	int a[];
	int count;
	public Stack(int size) {
		a=new int[size];
	}
	public void push(int num) {
		if (count==a.length) {
			System.out.println("error");
			return;
		}
		a[count++]=num;
	}
	public int pop() {
		if(count==0) {
			System.out.println("error");
			return -1;
		}
		int num=a[--count];
		return num;
	}
	public void output() {
		for(int i=count-1;i>=0;i--)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		Stack s=new Stack(5);
		for(int i = 0;i < 5;i++) {
			s.push(i);
		}
		s.output();
		s.pop();
		s.pop();
		s.output();	
	}
}

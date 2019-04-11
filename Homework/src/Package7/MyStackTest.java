package Package7;

public class MyStackTest 
{
	public static void main(String[] args) 
	{
		MyStack stack = new MyStack();
		stack.push(new Integer(1));
		stack.push(new Integer(2));
		stack.push(new Integer(3));
		System.out.println(stack.pop());
		stack.push(new Integer(4));
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push(new Integer(5));
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}

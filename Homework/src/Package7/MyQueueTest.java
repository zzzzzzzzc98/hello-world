package Package7;

public class MyQueueTest 
{
	public static void main(String[] args) 
	{		
		MyQueue queue = new MyQueue();
		queue.in(new Integer(1));
		queue.in(new Integer(2));
		queue.in(new Integer(3));
		System.out.println(queue.out());
		queue.in(new Integer(4));
		System.out.println(queue.out());
		System.out.println(queue.out());
		System.out.println(queue.out());
		System.out.println(queue.out());
		queue.in(new Integer(5));
		System.out.println(queue.out());
		System.out.println(queue.out());
	}
}

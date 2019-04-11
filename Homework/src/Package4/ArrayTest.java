package Package4;

public class ArrayTest {
	public static void main(String args[]) {
		int a[] = {1,9,2,5,7,6,3,4,8};
	}
	
	public void print(int a[]) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public int[] sort(int a[]) {
		int temp;
		for(int i = 0; i < a.length - 1; i++) {
			  for(int j = i + 1; j < a.length; j++) {
				  if(a[i] < a[j]) {
					  temp = a[i];
					  a[i] = a[j];
					  a[j] = temp;
				  }
			  }
		}
		return a;
	}
}

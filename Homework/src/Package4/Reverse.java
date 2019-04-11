package Package4;

public class Reverse {
	public static int[] reverse(int[] a) {
		for(int i=0;i<a.length/2;i++) {
			int t=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=t;
		}
		return a;
	}

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		reverse(a);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}

}

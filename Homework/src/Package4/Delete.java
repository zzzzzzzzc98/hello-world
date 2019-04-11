package Package4;

public class Delete {
	public static int[] delete(int[] a,int n) {
		 int b[] = new int[a.length - 1];  
	        for (int i = 0; i < b.length; i++) {  
	            if (i < n - 1) {  
	                b[i] = a[i];  
	            } else {  
	                b[i] = a[i + 1];  
	            }  
	        }  
	        return b;
	}
}

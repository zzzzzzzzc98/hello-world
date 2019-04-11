package Package4;

import java.util.Arrays;

public class Insert {
	public static void main(String args[]){
		int arr[] = {1,5,3,6,7,2};
		int iarr[] = Arrays.copyOf(arr, arr.length+1);
		int k = 4;//插入数字
		int n = 3;//插入在n个数后
		System.arraycopy(arr,n,iarr,n+1,arr.length-n);
		iarr[n] = k;
	for(int i = 0 ; i < iarr.length;i++)
	System.out.print(iarr[i]+" ");
	}
}

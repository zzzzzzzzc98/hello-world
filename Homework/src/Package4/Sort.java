package Package4;

public class Sort {
	public static void main(String a[]){
		int temp;
		int arr[] = {1,9,6,3,2,5,8,7,4};
			for(int i = 0;i < arr.length - 1;i++){
				for(int j = i + 1;j < arr.length;j++){
					if(arr[i] < arr[j]){
						temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
			}
			for(int i = 0;i < arr.length;i++){
				System.out.print(arr[i]+" ");
			}
	}
}

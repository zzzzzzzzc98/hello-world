package Package4;

public class InsertRequired {
	int a[] = {1,2,3,4,5,6};
	int count = 6;	
	public void insert(int pos,int num){
		if(a.length == count){
			int a1[] = new int[a.length*2];
			System.arraycopy(a,0,a1,0,a.length);
			a = a1;
		}		
		for(int i = count;i > pos;i--){
			a[i] = a[i-1];
		}
		a[pos] = num;
		count++;
	}
	public void delete(int pos){
		count--;
		for(int i = pos; i <= count;i++){
			a[i] = a[i+1];
		}
	}
	public void output(){
		for(int i = 0;i < count;i++){
			System.out.print(a[i] + "  ");
		}	
		System.out.println();
	}

	public void expand(){
		int a1[] = new int[a.length*2];
		System.arraycopy(a,0,a1,0,a.length);
		a = a1;		
	}
	public static void main(String[] args){
		InsertRequired aid = new InsertRequired();
		aid.output();
		aid.insert(2,13123);
		aid.insert(5,323423);
		aid.output();
		aid.delete(2);
		aid.output();
	}

}

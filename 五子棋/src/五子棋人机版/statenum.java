package �������˻���;

public class statenum {
public static double[][] getstatenum(boolean[][] h,boolean[][] b){
	double[][] num=new double[h.length][h.length];
	for (int i = 0; i < num.length; i++) {
		for (int j = 0; j < num.length; j++) {
			checkwin.check(h, i, j);
			num[i][j]=checkwin.weight;//�м��͸��ʳ����ڴ�й©!!!	
			if(h[i][j])
				num[i][j]=0;
			if (b[i][j]) {
				num[i][j]=-1;
				
			}
		}
		
		
	}
	return num;
}
}

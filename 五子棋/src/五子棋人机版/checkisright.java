package �������˻���;

public class checkisright {//���˴��ܷ������
	public static boolean check(boolean[][] b,boolean[][] h,int prex,int prey) {
		if (b[prex][prey]||h[prex][prey]) {
			return false;
		}
		else {
			return true;
		}
	}

}

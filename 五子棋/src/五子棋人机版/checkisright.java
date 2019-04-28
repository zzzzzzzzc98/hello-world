package 五子棋人机版;

public class checkisright {//检查此处能否放棋子
	public static boolean check(boolean[][] b,boolean[][] h,int prex,int prey) {
		if (b[prex][prey]||h[prex][prey]) {
			return false;
		}
		else {
			return true;
		}
	}

}

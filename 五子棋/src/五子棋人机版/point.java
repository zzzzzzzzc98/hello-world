package 五子棋人机版;

public class point {
	private int x=0;
	private int y=0;
	public point() {
		this(0, 0);
	}
	public point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}

}

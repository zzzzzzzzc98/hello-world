package 五子棋人机版;

import java.awt.Point;

public class store {

private	Boolean b[][],h[][];
private	point pinit[][];
private	int timeb,timeh;
boolean stored=false;
private boolean tob,toh;
public void tostore(boolean[][] b2,boolean[][] h2,boolean tob,boolean toh,point pinit[][],int timeb,int timeh) {
	this.b=new Boolean[b2.length][b2.length];
	this.h=new Boolean[h2.length][h2.length];
	this.pinit=new point[pinit.length][pinit.length];
	this.tob=tob;
	this.toh=toh;
	this.timeb=timeb;
	this.timeh=timeh;
	this.stored=true;
	for (int i = 0; i < pinit.length; i++) {
		for (int n = 0; n < pinit.length; n++) {
		this.b[i][n]=b2[i][n];
		this.h[i][n]=h2[i][n];
		this.pinit[i][n]=pinit[i][n];
		
		
	}
	}
}
public store() {
	
}
public Boolean[][] getB() {
	return b;
}
public Boolean[][] getH() {
	return h;
}
public point[][] getPinit() {
	return pinit;
}
public int getTimeb() {
	return timeb;
}
public int getTimeh() {
	return timeh;
}public Boolean getTob() {
	return tob;
}public Boolean getToh() {
	return toh;
}
}

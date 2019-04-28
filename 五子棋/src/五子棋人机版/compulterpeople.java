package 五子棋人机版;

public class compulterpeople {
public static point getPoint(double[][] num,double numcomputer[][],boolean b[][],boolean h[][]) {
	boolean havefour=assume.checkfour(b, h);
	point p=assume.p;
	boolean havefourcom=assume.checkfour(h, b);//人机
	point pcom=assume.p;
	double middle=num[0][0];
	double middlec=numcomputer[0][0];
	int x=0,y=0;
	int xc=0,yc=0;
for (int i = 0; i < num.length; i++) {
	for (int j = 0; j < num.length; j++) {
		if (middle<num[i][j]) {
			x=i;
			y=j;
			middle=num[i][j];
		}
		if (middlec<numcomputer[i][j]) {
			xc=i;
			yc=j;
			middlec=numcomputer[i][j];
		}
		
	}
	
}	//找到防守要点(x,y)
if (x==0&&y==0) {//人机如果先走
	return new point(10,10);
	
}
if (middlec>=4.0) {
	
}
else {
	if (havefourcom&&(pcom.getX()!=0||pcom.getY()!=0)) {//优先使用AI进行假三真四攻击
	return pcom;
	
	
}
}

if (middlec>=4.0) {//适当攻击
	return new point(xc,yc);
}
else {
	if (middle>=4.0) {//如果4.0已经存在再次判断一定出错
		
	}
	else {
		if (havefour) {//假三真四问题---人
		return p;
	}
	}
	
	if (middle<4.0&&middle>=3.0) {
//待优化		
}
if(middle<3.0) {
	if (middlec>=3.0) {
		return new point(xc,yc);
		
	}
}
if ((int)middle==(int)middlec) {
	return new point(xc,yc);
	
}
	
}


	
	return new point(x,y);
}
}

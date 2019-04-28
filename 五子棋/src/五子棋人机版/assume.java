package 五子棋人机版;

public class assume {//假设人下的下一步并从预知的下一步中找到最优解
	static point p;
	public static boolean checkfour(boolean[][] b,boolean[][] h) {
		//创建操作副本防止影响数据源
		boolean b1[][]=new boolean[b.length][h.length];
		boolean h1[][]=new boolean[b.length][h.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < h.length; j++) {
				b1[i][j]=b[i][j];
				h1[i][j]=h[i][j];
				
			}
			
		}
		
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < h.length; j++) {
				if (b1[i][j]||h1[i][j]) {
					
				}
				else {
					h1[i][j]=true;//假定该点为真
					double numd[][]=statenum.getstatenum(h1,b1);//计算当前非人机的权值
					for (int i1 = 0; i1 < b.length; i1++) {
						for (int j1 = 0; j1 < h.length; j1++) {
							if (numd[i1][j1]>=1.0) {
								System.out.println("如果"+i+","+j+"为真则"+i1+","+j1+"权重为"+numd[i1][j1]);
							}
							
							if (numd[i1][j1]>=4.0) {
								System.err.println("出现必争点"+i+"\t"+j);
								p=new point(i,j);
						    return true;
							}
							
						}
					
						
					}h1[i][j]=false;
				}
				
			}
			
		}
		
		return false;
	}

}

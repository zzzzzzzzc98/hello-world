package �������˻���;

public class assume {//�������µ���һ������Ԥ֪����һ�����ҵ����Ž�
	static point p;
	public static boolean checkfour(boolean[][] b,boolean[][] h) {
		//��������������ֹӰ������Դ
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
					h1[i][j]=true;//�ٶ��õ�Ϊ��
					double numd[][]=statenum.getstatenum(h1,b1);//���㵱ǰ���˻���Ȩֵ
					for (int i1 = 0; i1 < b.length; i1++) {
						for (int j1 = 0; j1 < h.length; j1++) {
							if (numd[i1][j1]>=1.0) {
								System.out.println("���"+i+","+j+"Ϊ����"+i1+","+j1+"Ȩ��Ϊ"+numd[i1][j1]);
							}
							
							if (numd[i1][j1]>=4.0) {
								System.err.println("���ֱ�����"+i+"\t"+j);
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

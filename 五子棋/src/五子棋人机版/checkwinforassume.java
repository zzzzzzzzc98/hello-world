package 五子棋人机版;

import java.awt.Color;
//优化因频繁调用assume引起的内存泄漏
/*
 * 与类checkwin保持一致
 */
public class checkwinforassume {
public static double weight=0;
public static Boolean check(boolean[][] b,int x,int y) {
				//System.out.println("当前检测"+x+"\t"+y);
				int right=0;
				int left=0;
				int up=0;
				int down=0;
				int rightdown=0;
				int rightup=0;
				int leftup=0;
				int leftdown=0;
					//向右查找
				if(x+4<b.length)
				   right=rightcheck(new Boolean[] {b[x+1][y],b[x+2][y],b[x+3][y],b[x+4][y]});
				  else {
					  if(x+3<b.length)
						  right=rightcheck(new Boolean[] {b[x+1][y],b[x+2][y],b[x+3][y]});
					  else {
						  if(x+2<b.length)
							  right= rightcheck(new Boolean[] {b[x+1][y],b[x+2][y]});
						 else {
							 if(x+1<b.length)
								 right=rightcheck(new Boolean[] {b[x+1][y]});
							 else {
								 right=rightcheck(null);
							}
							
						}
					}
				}
				if(x-4>=0)
					   left=rightcheck(new Boolean[] {b[x-1][y],b[x-2][y],b[x-3][y],b[x-4][y]});
					  else {
						  if(x-3>=0)
							  left=rightcheck(new Boolean[] {b[x-1][y],b[x-2][y],b[x-3][y]});
						  else {
							  if(x-2>=0)
								  left= rightcheck(new Boolean[] {b[x-1][y],b[x-2][y]});
							 else {
								 if(x-1>=0)
									 left=rightcheck(new Boolean[] {b[x-1][y]});
								 else {
									 left=rightcheck(null);
								}
							 }
							}
						}
				  if(y-4>=0)
					   up=rightcheck(new Boolean[] {b[x][y-1],b[x][y-2],b[x][y-3],b[x][y-4]});
					  else {
						  if(y-3>=0)
							  up=rightcheck(new Boolean[] {b[x][y-1],b[x][y-2],b[x][y-3]});
						  else {
							  if(y-2>=0)
								  up= rightcheck(new Boolean[] {b[x][y-1],b[x][y-2]});
							 else {
								 if(y-1>=0)
									 up=rightcheck(new Boolean[] {b[x][y-1]});
								 else {
									 up=rightcheck(null);
								}
								
							}
						}
			}
				  if(y+4<b.length)
					  down=rightcheck(new Boolean[] {b[x][y+1],b[x][y+2],b[x][y+3],b[x][y+4]});
					  else {
						  if(y+3<b.length)
							  down=rightcheck(new Boolean[] {b[x][y+1],b[x][y+2],b[x][y+3]});
						  else {
							  if(y+2<b.length)
								  down= rightcheck(new Boolean[] {b[x][y+1],b[x][y+2]});
							 else {
								 if(y+1<b.length)
									 down=rightcheck(new Boolean[] {b[x][y+1]});
								 else {
									 down=rightcheck(null);
								}
								
							}
						}
					}
				  if(y+4<b.length&&x+4<b.length)
					  rightdown=rightcheck(new Boolean[] {b[x+1][y+1],b[x+2][y+2],b[x+3][y+3],b[x+4][y+4]});
					  else {
						  if(y+3<b.length&&x+3<b.length)
							  rightdown=rightcheck(new Boolean[] {b[x+1][y+1],b[x+2][y+2],b[x+3][y+3]});
						  else {
							  if(y+2<b.length&&x+2<b.length)
								  rightdown= rightcheck(new Boolean[] {b[x+1][y+1],b[x+2][y+2]});
							 else {
								 if(y+1<b.length&&x+1<b.length)
									 rightdown=rightcheck(new Boolean[] {b[x+1][y+1]});
								 else {
									 rightdown=rightcheck(null);
								}
								
							}
						}
					}
				  if(y+4<b.length&&x-4>=0)
					  leftdown=rightcheck(new Boolean[] {b[x-1][y+1],b[x-2][y+2],b[x-3][y+3],b[x-4][y+4]});
					  else {
						  if(y+3<b.length&&x-3>=0)
							  leftdown=rightcheck(new Boolean[] {b[x-1][y+1],b[x-2][y+2],b[x-3][y+3]});
						  else {
							  if(y+2<b.length&&x-2>=0)
								  leftdown= rightcheck(new Boolean[] {b[x-1][y+1],b[x-2][y+2]});
							 else {
								 if(y+1<b.length&&x-1>=0)
									 leftdown=rightcheck(new Boolean[] {b[x-1][y+1]});
								 else {
									 leftdown=rightcheck(null);
								}
								
							}
						}
					}
				  if(y-4>=0&&x-4>=0)
					  leftup=rightcheck(new Boolean[] {b[x-1][y-1],b[x-2][y-2],b[x-3][y-3],b[x-4][y-4]});
					  else {
						  if(y-3>=0&&x-3>=0)
							  leftup=rightcheck(new Boolean[] {b[x-1][y-1],b[x-2][y-2],b[x-3][y-3]});
						  else {
							  if(y-2>=0&&x-2>=0)
								  leftup= rightcheck(new Boolean[] {b[x-1][y-1],b[x-2][y-2]});
							 else {
								 if(y-1>=0&&x-1>=0)
									 leftup=rightcheck(new Boolean[] {b[x-1][y-1]});
								 else {
									 leftup=rightcheck(null);
								}
								
							}
						}
					}
				  if(x+4<b.length&&y-4>=0)
					  rightup=rightcheck(new Boolean[] {b[x+1][y-1],b[x+2][y-2],b[x+3][y-3],b[x+4][y-4]});
					  else {
						  if(x+3<b.length&&y-3>=0)
							  rightup=rightcheck(new Boolean[] {b[x+1][y-1],b[x+2][y-2],b[x+3][y-3]});
						  else {
							  if(x+2<b.length&&y-2>=0)
								  rightup= rightcheck(new Boolean[] {b[x+1][y-1],b[x+2][y-2]});
							 else {
								 if(x+1<b.length&&y-1>=0)
									 rightup=rightcheck(new Boolean[] {b[x+1][y-1]});
								 else {
									 rightup=rightcheck(null);
								}
								
							}
						}
	              }				
				 // System.out.println(up+"\t"+down+"\t"+left+"\t"+right+"\t"+leftdown+"\t"+leftup+"\t"+rightdown+"\t"+rightup);
				  int sum=0;
				  double up1=up==1?0.01:(double)up;
				  double down1=down==1?0.01:(double)down;
				  double left1=left==1?0.01:(double)left;
				  double right1=right==1?0.01:(double)right;
				  double leftdown1=leftdown==1?0.01:(double)leftdown;
				  double leftup1=leftup==1?0.01:(double)leftup;
				  double rightdown1=rightdown==1?0.01:(double)rightdown;
				  double rightup1=rightup==1?0.01:(double)rightup;
				  if ((sum=up+down+right+left+leftdown+leftup+rightup+rightdown)==0) {
					  weight=0.0;
					  
					  
					
				}
				  else {
					  if (sum==1) {
						  weight=1.0;
						
					}
					  else {//附近多于一个
						weight=up1+down1+left1+right1+rightdown1+rightup1+leftdown1+leftup1;
						if (weight<1)
							weight+=1;
							
					}
					  if (weight>=3.0) {//假3.01   3.02   3.03 3.0判断
						  //找出三的位置
						  if (up==3) {
							if (y-4>=0) {
								if (fiveinarow.state[x][y-4]==-1) {
									weight=2.9;
									
								}
							}else {
								weight=2.9;
							}
						}
						  if (down==3) {
								if (y+4<b.length) {
									if (fiveinarow.state[x][y+4]==-1) {
										weight=2.9;
										
									}
								}else {
									weight=2.9;
								}
							}
						  if (right==3) {
								if (x+4<b.length) {
									if (fiveinarow.state[x+4][y]==-1) {
										weight=2.9;
										
									}
								}else {
									weight=2.9;
								}
							}
						  if (left==3) {
								if (x-4>0) {
									if (fiveinarow.state[x-4][y]==-1) {
										weight=2.9;
										
									}
								}else {
									weight=2.9;
								}
							}
						  if (rightup==3) {
								if (x+4<b.length&&y-4>0) {
									if (fiveinarow.state[x+4][y-4]==-1) {
										weight=2.9;
										
									}
								}else {
									weight=2.9;
								}
							}
						  if (rightdown==3) {
								if (x+4<b.length&&y+4<b.length) {
									if (fiveinarow.state[x+4][y+4]==-1) {
										weight=2.9;
										
									}
								}else {
									weight=2.9;
								}
							}
						  if (leftup==3) {
								if (x-4>0&&y-4>0) {
									if (fiveinarow.state[x-4][y-4]==-1) {
										weight=2.9;
										
									}
								}else {
									weight=2.9;
								}
							}
						  if (leftdown==3) {
								if (x-4>0&&y+4<b.length) {
									if (fiveinarow.state[x-4][y+3]==-1) {
										weight=2.9;
										
									}
								}else {
									weight=2.9;
								}
							}
					  }
					  if (weight>=4.0) {//假四判断
						  if (up==2||down==2||left==2||right==2||leftdown==2||leftup==2||rightdown==2||rightup==2) {
							  weight=2.3;
							
						}
						
					}
					
				}
				  if (weight>4.0) {
					  weight=2.99;
					
				}
if (up+down==4||left+right==4||leftdown+rightup==4||leftup+rightdown==4) {
	return true;	
}
else {
	return false;
}
			
}



public static int rightcheck(Boolean[] b) {
	int num=0;
	if (b==null) {
		return 0;
	}
	else {
		for (Boolean boo : b) {
			if (boo) {
				num++;
			}
			else {
				return num;
			}
			
		}
	}
	return num;
	
}
	
}

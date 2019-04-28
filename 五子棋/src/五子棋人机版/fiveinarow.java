package 五子棋人机版;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.print.Book;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.StyledEditorKit.BoldAction;

public class fiveinarow extends JFrame{
	point pinit[][]=new point[20][20];
   boolean initb=false;
   boolean b[][]=new boolean[20][20];
   boolean tob=true;
   boolean computer=tob;//tob为真  人机为白子且先走
   boolean openc=true;//人机开关
   boolean toh=false;
   boolean closs=true;
   boolean h[][]=new boolean[20][20]; 
   int piecex=0,piecey=0;
   Boolean win=false;
   String winername="";
   int timeb=0,timeh=0,times=0;
   setpiece p=new setpiece();
   store makeStore[]=new store[20*20];//大小根据网格数定
  static double[][] state=new double[20][20];
  static double[][] statecomplter=new double[20][20];
  boolean test=false;//调试模式开关
	public fiveinarow() {
		this(false,false);
		
	}
	public fiveinarow(boolean openc,boolean computer) {
		
		this.openc=openc;
		this.computer=computer;
		init();
		initstore();
		initcloss();
		addMouseListener(p);
		setSize(1200,950);
		setVisible(true);
		
	}
	private void initstore() {
		for (int i = 0; i < makeStore.length; i++) {
			makeStore[i]=new store();
			
		}
		
	}
	protected void makestore() {
		for (int i = 0; i < makeStore.length; i++) {
			if (makeStore[i].stored) {
				
			}
			else {
				makeStore[i].tostore(b, h, tob, toh, pinit, timeb, timeh);
				System.out.println("第"+i+"个存储位置");
				return;
			}
			
		}

	}
	protected void makeunstore() {
		for (int i =makeStore.length-1; i>=0; i--) {
			if (makeStore[i].stored) {
				//连接仓库数据
				Boolean bmiddle[][]=makeStore[i].getB();
				Boolean hmiddle[][]=makeStore[i].getH();
				point pmiddle[][]=makeStore[i].getPinit();
				for (int i1 = 0; i1 < pinit.length; i1++) {
					for (int n = 0; n < pinit.length; n++) {
					this.b[i1][n]=bmiddle[i1][n];
					this.h[i1][n]=hmiddle[i1][n];
					this.pinit[i1][n]=pmiddle[i1][n];
					
					
				}
				}
				this.tob=makeStore[i].getTob();
				this.toh=makeStore[i].getToh();
				this.timeb=makeStore[i].getTimeb();
				this.timeh=makeStore[i].getTimeh();
				//断开仓库与栈中数据的连接
				makeStore[i].stored=false;
				System.err.println("从第"+i+"个存储位置恢复");
				win=false;
				repaint();
				return;
			}
			
		}

	}
	private void initcloss() {
		addWindowListener(new WindowAdapter() {

			
			@Override
			public void windowActivated(WindowEvent e) {
				new Thread() {
					
					public void run() {
						while (closs) {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							if (!win) {
								if (tob) {timeb++;
							
						}
						else {
							timeh++;
						}
							}
							
							//repaint();
							
							
						}
									
					}
						
					}.start();
			}

			public void windowClosing(WindowEvent e) {//关闭启动的线程彻底关闭程序
				closs=false;
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "程序已完全退出,感谢你的使用,作者QQ:1587613421");
				// TODO 自动生成的方法存根
				
			}
				
		});
			
	
		
		
	}
	public void init() {
	
		for (int xc = 0; xc<= pinit.length-1; xc++) {
			for (int yc = 0; yc <= pinit.length-1; yc++) {
				pinit[xc][yc]=new point(xc*45+20,yc*45+50);
				b[xc][yc]=false;
				h[xc][yc]=false;
				state[xc][yc]=0.0;
			}
			
		}
		timeb =0;
		timeh=0;
		win=false;
		initb=true;
		if (computer) {
			new Thread() {
				public void run() {
					if(true) {//人机开关
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
						point p=new point();
						if(computer)
							p=compulterpeople.getPoint(statecomplter, state, b, h);
						else
							p=compulterpeople.getPoint(state,statecomplter,b,h);//前面为非人机--
						b[p.getX()][p.getY()]=true;
						tob=false;
						//人机模式输赢附加判断
						if (checkwin.check(b, p.getX(), p.getY())) {
							win=true;
							//JOptionPane.showMessageDialog(fiveinarow.this, "黑子获胜");
							winername="黑子获胜";
							
						}
						repaint();
						
						
					}
				}
			}.start();
			
		}
		
		repaint();
	}
	public void paint(Graphics g) {
		if (true) {
			super.paint(g);			
		}
		g.setColor(Color.orange);
		g.fillRect(0, 0, 900, 950);
	if (initb) {
		
	   for (int x = 0; x< pinit.length; x++) {
		for (int y = 0; y < pinit.length; y++) {
			g.setColor(Color.black);
			g.setFont(new Font("微软雅黑",Font.BOLD,15));
			if(y==0)
			   g.drawString(""+x, pinit[x][y].getX(), pinit[x][y].getY());
			if(x==0)
				g.drawString(""+y,pinit[x][y].getX(), pinit[x][y].getY());
			if (x!=19) {g.drawLine(pinit[x][y].getX(), pinit[x][y].getY(),pinit[x+1][y].getX(), pinit[x+1][y].getY());
			
			}
			if (y!=19) {
				g.drawLine(pinit[x][y].getX(), pinit[x][y].getY(),pinit[x][y+1].getX(), pinit[x][y+1].getY());
			     
			}	

			if (b[x][y]) {
				g.setColor(Color.BLACK);
				g.fillOval(pinit[x][y].getX()-15,pinit[x][y].getY()-15, 30, 30);
			
						}
				if (h[x][y]) {
					g.setColor(Color.white);
				    g.fillOval(pinit[x][y].getX()-15,pinit[x][y].getY()-15, 30, 30);			
				}
				if (test) {
					g.drawString(""+state[x][y], pinit[x][y].getX(), pinit[x][y].getY());
				g.setColor(Color.red);
				g.drawString(""+statecomplter[x][y], pinit[x][y].getX(), pinit[x][y].getY()+8);
				}
				g.setColor(Color.green);
				
		}
		
	}}
	
	g.setFont(new Font("华云彩文", Font.BOLD, 40));
	g.setColor(new Color(0XFD9BEB, false));
	if (tob) {
		g.drawString("轮到黑方", 930, 90);
	}
	else {
		g.setColor(new Color(0XADE483, false));
		g.drawString("轮到白方", 930, 90);
		
	}
	g.setFont(new Font("微软雅黑",Font.BOLD,25));
	g.setColor(Color.gray);
	if (tob) {
		g.drawString("黑方用时"+timeh, 930, 210);
		g.setColor(Color.red);
		g.drawString("白方用时"+timeb, 930, 180);
	}
	else {
		g.drawString("白方用时"+timeb, 930, 180);
		g.setColor(Color.red);
		g.drawString("黑方用时"+timeh, 930, 210);
	}
	
	g.setColor(Color.BLUE);
	g.drawString("本局总时长"+String.valueOf(timeb+timeh), 930, 240);
	g.setColor(new Color(153,153,255));
	g.drawRect(970, 270, 100, 50);
	g.setColor(Color.black);
	g.drawString("悔棋", 980, 300);
	g.drawRect(970, 320, 100, 50);
	g.setColor(Color.black);
	if(test)
	g.drawString("调试开", 980, 350);
	else g.drawString("调试关", 980, 350);
	g.drawRect(970, 370, 100, 50);
	g.setColor(Color.black);
	if (openc)
	g.drawString("人机开", 980, 400);
	else g.drawString("人机关", 980, 400);
	g.drawRect(970, 420, 100, 50);
	g.setColor(Color.black);
	g.drawString("人机黑子", 980, 450);
	
	
	g.setColor(Color.gray);
	g.drawRect(970, 100, 100, 50);
	g.setColor(Color.green);
	g.setFont(new Font("微软雅黑", Font.BOLD, 25));
	g.drawString("新游戏", 980, 130);
	if (win) {
		g.setFont(new Font("微软雅黑",Font.BOLD,80));
		g.setColor(Color.red);
		g.drawString(winername, 450, 450);
		
	}
		
	}
	
	
	class setpiece implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			piecex=Integer.valueOf((int) (Math.round((Double.valueOf(e.getX()-25))/45)));
			piecey=Integer.valueOf((int) (Math.round((Double.valueOf(e.getY()-45))/45)));
			if (piecex<20&&piecey<20&&!win) {
			
			if (checkisright.check(b, h, piecex, piecey)) {
				makestore();
				if (tob) {
					b[piecex][piecey]=true;
					if (checkwin.check(b,piecex,piecey)) {
						win=true;
						//JOptionPane.showMessageDialog(fiveinarow.this, "黑子获胜");
						winername="黑子获胜";
					}
					toh=true;
					tob=false;
				}
				else {
					
					h[piecex][piecey]=true;
					if (checkwin.check(h,piecex,piecey)) {
						win=true;
						//JOptionPane.showMessageDialog(fiveinarow.this, "白子获胜");
						winername="白子获胜";
					}
					tob=true;
					toh=false;
				}
				state=statenum.getstatenum(h,b);//前面的为非人机玩家
				statecomplter=statenum.getstatenum(b, h);//计算人机权重
				repaint();
				
				new Thread() {
					public void run() {
						if(openc) {//人机开关
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								// TODO 自动生成的 catch 块
								e.printStackTrace();
							}
							point p=new point();
							if(computer)
								p=compulterpeople.getPoint(statecomplter, state, b, h);
							else
								p=compulterpeople.getPoint(state,statecomplter,b,h);//前面为非人机--
							b[p.getX()][p.getY()]=true;
							tob=false;
							//人机模式输赢附加判断
							if (checkwin.check(b, p.getX(), p.getY())) {
								win=true;
								//JOptionPane.showMessageDialog(fiveinarow.this, "黑子获胜");
								winername="黑子获胜";
								
							}
							repaint();
							
							
						}
					}
				}.start();
				
				//System.out.println(checkwin.rightcheck(new Boolean[] {true,false,true}));
			}
			
			}
			
			
			// TODO 自动生成的方法存根
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO 自动生成的方法存根
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			if (e.getX()<1070&&e.getX()>970&&e.getY()<150&&e.getY()>100) {
				init();
			}
			if (e.getX()<1070&&e.getX()>970&&e.getY()<320&&e.getY()>270) {
				makeunstore();
				System.out.println("请求悔棋");
			}
			if (e.getX()<1070&&e.getX()>970&&e.getY()<370&&e.getY()>320) {
				test=!test;
				repaint();
			}
			if (e.getX()<1070&&e.getX()>970&&e.getY()<420&&e.getY()>370) {
				openc=!openc;
				repaint();
				if (openc) {//人机打开的时候如果人机(黑子)没有白子多(即此时轮到黑子)
					if (tob) {
						new Thread() {
							public void run() {
								if(true) {//人机开关
									try {
										Thread.sleep(500);
									} catch (InterruptedException e) {
										// TODO 自动生成的 catch 块
										e.printStackTrace();
									}
									point p=new point();
									
									p=compulterpeople.getPoint(state,statecomplter,b,h);//前面为非人机--
									b[p.getX()][p.getY()]=true;
									tob=false;
									//人机模式输赢附加判断
									if (checkwin.check(b, p.getX(), p.getY())) {
										win=true;
										//JOptionPane.showMessageDialog(fiveinarow.this, "黑子获胜");
										winername="黑子获胜";
										
									}
									repaint();
									
									
								}
							}
						}.start();
						
					}
					repaint();
				}
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO 自动生成的方法存根
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO 自动生成的方法存根
			
		}
		
	}

}



import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FiveChessFrame extends JFrame implements MouseListener, Runnable {

	// ȡ����Ļ�Ŀ��
	int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	// ȡ����Ļ�ĸ߶�
	int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	// ����ͼƬ
	BufferedImage bgImage = null;
	// �������ӵ�����
	int x = 0;
	int y = 0;
	// ����֮ǰ�¹���ȫ�����ӵ�����
	// ������������ 0�� ��ʾ����㲢û�����ӣ� 1�� ��ʾ������Ǻ��ӣ� 2����ʾ������ǰ���
	int[][] allChess = new int[19][19];
	// ��ʶ��ǰӦ�ú��廹�ǰ�������һ��
	boolean isBlack = true;
	// ��ʶ��ǰ��Ϸ�Ƿ���Լ���
	boolean canPlay = true;
	// ������ʾ����ʾ��Ϣ
	String message = "�ڷ�����";
	// �������ӵ�ж���ʱ��(��)
	int maxTime = 0;
	// ������ʱ���߳���
	Thread t = new Thread(this);
	// ����ڷ���׷���ʣ��ʱ��
	int blackTime = 0;
	int whiteTime = 0;
	// ����˫��ʣ��ʱ�����ʾ��Ϣ
	String blackMessage = "������";
	String whiteMessage = "������";

	public FiveChessFrame() {
		// ���ñ���
		this.setTitle("������");
		// ���ô����С
		this.setSize(500, 500);
		// ���ô������λ��
		this.setLocation((width - 500) / 2, (height - 500) / 2);
		// ����������Ϊ��С���ɸı�
		this.setResizable(false);
		// ������Ĺرշ�ʽ����ΪĬ�Ϲرպ�������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Ϊ������������
		this.addMouseListener(this);
		// ��������ʾ����
		this.setVisible(true);

		t.start();

		// ˢ����Ļ,��ֹ��ʼ��Ϸʱ�����޷���ʾ�����.
		this.repaint();
		String imagePath = "" ;
		try {
			imagePath = System.getProperty("user.dir")+"/image/background.jpg" ;
			bgImage = ImageIO.read(new File(imagePath.replaceAll("\\\\", "/")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void paint(Graphics g) {
		// ˫���弼����ֹ��Ļ��˸
		BufferedImage bi = new BufferedImage(500, 500,
				BufferedImage.TYPE_INT_RGB);
		Graphics g2 = bi.createGraphics();
		g2.setColor(Color.orange);
		// ���Ʊ���
		g2.drawImage(bgImage, 1, 20, this);
		// ���������Ϣ
		g2.setFont(new Font("����", Font.BOLD, 20));
		g2.drawString("��Ϸ��Ϣ��" + message, 130, 60);
		// ���ʱ����Ϣ
		g2.setFont(new Font("����", 0, 14));
		g2.drawString("�ڷ�ʱ�䣺" + blackMessage, 30, 470);
		g2.drawString("�׷�ʱ�䣺" + whiteMessage, 260, 470);

		// ��������
		for (int i = 0; i < 19; i++) {
			g2.drawLine(10, 70 + 20 * i, 370, 70 + 20 * i);
			g2.drawLine(10 + 20 * i, 70, 10 + 20 * i, 430);
		}

		// ��ע��λ
		g2.fillOval(68, 128, 4, 4);
		g2.fillOval(308, 128, 4, 4);
		g2.fillOval(308, 368, 4, 4);
		g2.fillOval(68, 368, 4, 4);
		g2.fillOval(308, 248, 4, 4);
		g2.fillOval(188, 128, 4, 4);
		g2.fillOval(68, 248, 4, 4);
		g2.fillOval(188, 368, 4, 4);
		g2.fillOval(188, 248, 4, 4);
		// ����ȫ������
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				if (allChess[i][j] == 1) {
					// ����
					int tempX = i * 20 + 10;
					int tempY = j * 20 + 70;
					g2.setColor(Color.BLACK);
					g2.fillOval(tempX - 7, tempY - 7, 14, 14);
				}
				if (allChess[i][j] == 2) {
					// ����
					int tempX = i * 20 + 10;
					int tempY = j * 20 + 70;
					g2.setColor(Color.WHITE);
					g2.fillOval(tempX - 7, tempY - 7, 14, 14);
					g2.setColor(Color.BLACK);
					g2.drawOval(tempX - 7, tempY - 7, 14, 14);
				}
			}
		}
		g.drawImage(bi, 0, 0, this);
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("X:"+e.getX()); System.out.println("Y:"+e.getY());
		 */
		if (canPlay == true) {
			x = e.getX();
			y = e.getY();
			if (x >= 10 && x <= 370 && y >= 70 && y <= 430) {
				x = (x - 10) / 20;
				y = (y - 70) / 20;
				if (allChess[x][y] == 0) {
					// �жϵ�ǰҪ�µ���ʲô��ɫ������
					if (isBlack == true) {
						allChess[x][y] = 1;
						isBlack = false;
						message = "�ֵ��׷�";
					} else {
						allChess[x][y] = 2;
						isBlack = true;
						message = "�ֵ��ڷ�";
					}
					// �ж���������Ƿ����������������5�������ж���Ϸ�Ƿ����
					boolean winFlag = this.checkWin();
					if (winFlag == true) {
						JOptionPane.showMessageDialog(this, "��Ϸ����,"
								+ (allChess[x][y] == 1 ? "�ڷ�" : "�׷�") + "��ʤ��");
						canPlay = false;
					}
				} else {
					JOptionPane.showMessageDialog(this, "��ǰλ���Ѿ������ӣ����������ӣ�");
				}
				this.repaint();
			}
		}
		/* System.out.println(e.getX() + " -- " + e.getY()); */
		// ��� ��ʼ��Ϸ ��ť
		if (e.getX() >= 400 && e.getX() <= 470 && e.getY() >= 70
				&& e.getY() <= 100) {
			int result = JOptionPane.showConfirmDialog(this, "�Ƿ����¿�ʼ��Ϸ?");
			if (result == 0) {
				// �������¿�ʼ��Ϸ
				// ���¿�ʼ��Ҫ���Ĳ���: 1)���������,allChess���������ȫ�����ݹ�0.
				// 2) �� ��Ϸ��Ϣ: ����ʾ�Ļص���ʼλ��
				// 3) ����һ������ĸ�Ϊ�ڷ�
				for (int i = 0; i < 19; i++) {
					for (int j = 0; j < 19; j++) {
						allChess[i][j] = 0;
					}
				}
				// ��һ�ַ�ʽ allChess = new int[19][19];
				message = "�ڷ�����";
				isBlack = true;
				blackTime = maxTime;
				whiteTime = maxTime;
				if (maxTime > 0) {
					blackMessage = maxTime / 3600 + ":"
							+ (maxTime / 60 - maxTime / 3600 * 60) + ":"
							+ (maxTime - maxTime / 60 * 60);
					whiteMessage = maxTime / 3600 + ":"
							+ (maxTime / 60 - maxTime / 3600 * 60) + ":"
							+ (maxTime - maxTime / 60 * 60);
					t.resume();
				} else {
					blackMessage = "������";
					whiteMessage = "������";
				}
				this.canPlay = true; 
				this.repaint();

			}
		}
		// ��� ��Ϸ���� ��ť
		if (e.getX() >= 400 && e.getX() <= 470 && e.getY() >= 120
				&& e.getY() <= 150) {
			String input = JOptionPane
					.showInputDialog("��������Ϸ�����ʱ��(��λ:����),�������0,��ʾû��ʱ������:");
			try {
				maxTime = Integer.parseInt(input) * 60;
				if (maxTime < 0) {
					JOptionPane.showMessageDialog(this, "��������ȷ��Ϣ,���������븺��!");
				}
				if (maxTime == 0) {
					int result = JOptionPane.showConfirmDialog(this,
							"�������,�Ƿ����¿�ʼ��Ϸ?");
					if (result == 0) {
						for (int i = 0; i < 19; i++) {
							for (int j = 0; j < 19; j++) {
								allChess[i][j] = 0;
							}
						}
						// ��һ�ַ�ʽ allChess = new int[19][19];
						message = "�ڷ�����";
						isBlack = true;
						blackTime = maxTime;
						whiteTime = maxTime;
						blackMessage = "������";
						whiteMessage = "������";
						this.canPlay = true; 
						this.repaint();
					}
				}
				if (maxTime > 0) {
					int result = JOptionPane.showConfirmDialog(this,
							"�������,�Ƿ����¿�ʼ��Ϸ?");
					if (result == 0) {
						for (int i = 0; i < 19; i++) {
							for (int j = 0; j < 19; j++) {
								allChess[i][j] = 0;
							}
						}
						// ��һ�ַ�ʽ allChess = new int[19][19];
						message = "�ڷ�����";
						isBlack = true;
						blackTime = maxTime;
						whiteTime = maxTime;
						blackMessage = maxTime / 3600 + ":"
								+ (maxTime / 60 - maxTime / 3600 * 60) + ":"
								+ (maxTime - maxTime / 60 * 60);
						whiteMessage = maxTime / 3600 + ":"
								+ (maxTime / 60 - maxTime / 3600 * 60) + ":"
								+ (maxTime - maxTime / 60 * 60);
						this.canPlay = true; 
						this.repaint();
					}
				}
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this, "����ȷ������Ϣ!");
			}
		}
		// ��� ��Ϸ˵�� ��ť
		if (e.getX() >= 400 && e.getX() <= 470 && e.getY() >= 170
				&& e.getY() <= 200) {
			JOptionPane.showMessageDialog(this,
					"���һ����������Ϸ���򣬺ڰ�˫���������壬��ĳһ����������ʱ����Ϸ������");
		}
		// ��� ���� ��ť
		if (e.getX() >= 400 && e.getX() <= 470 && e.getY() >= 270
				&& e.getY() <= 300) {
			int result = JOptionPane.showConfirmDialog(this, "�Ƿ�ȷ������?");
			if (result == 0) {
				if (isBlack) {
					JOptionPane.showMessageDialog(this, "�ڷ��Ѿ�����,��Ϸ����!");
				} else {
					JOptionPane.showMessageDialog(this, "�׷��Ѿ�����,��Ϸ����!");
				}
				canPlay = false;
			}
		}
		// ��� ���� ��ť
		if (e.getX() >= 400 && e.getX() <= 470 && e.getY() >= 320
				&& e.getY() <= 350) {
			JOptionPane.showMessageDialog(this,
					"����Ϸ��MLDN�����������������Է���www.mldn.cn");
		}
		// ��� �˳� ��ť
		if (e.getX() >= 400 && e.getX() <= 470 && e.getY() >= 370
				&& e.getY() <= 400) {
			JOptionPane.showMessageDialog(this, "��Ϸ����");
			System.exit(0);
		}
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	private boolean checkWin() {
		boolean flag = false;
		// ���湲����ͬ��ɫ������������
		int count = 1;
		// �жϺ����Ƿ���5�������������ص� ������ ����ͬ�� ��allChess[x][y]��yֵ����ͬ
		int color = allChess[x][y];
		// �жϺ���
		count = this.checkCount(1, 0, color);
		if (count >= 5) {
			flag = true;
		} else {
			// �ж�����
			count = this.checkCount(0, 1, color);
			if (count >= 5) {
				flag = true;
			} else {
				// �ж����ϡ�����
				count = this.checkCount(1, -1, color);
				if (count >= 5) {
					flag = true;
				} else {
					// �ж����¡�����
					count = this.checkCount(1, 1, color);
					if (count >= 5) {
						flag = true;
					}
				}
			}
		}

		return flag;
	}

	// �ж��������ӵ�����
	private int checkCount(int xChange, int yChange, int color) {
		int count = 1;
		int tempX = xChange;
		int tempY = yChange;
		while (x + xChange >= 0 && x + xChange <= 18 && y + yChange >= 0
				&& y + yChange <= 18
				&& color == allChess[x + xChange][y + yChange]) {
			count++;
			if (xChange != 0)
				xChange++;
			if (yChange != 0) {
				if (yChange > 0)
					yChange++;
				else {
					yChange--;
				}
			}
		}
		xChange = tempX;
		yChange = tempY;
		while (x - xChange >= 0 && x - xChange <= 18 && y - yChange >= 0
				&& y - yChange <= 18
				&& color == allChess[x - xChange][y - yChange]) {
			count++;
			if (xChange != 0)
				xChange++;
			if (yChange != 0) {
				if (yChange > 0)
					yChange++;
				else {
					yChange--;
				}
			}
		}
		return count;
	}

	public void run() {
		// TODO Auto-generated method stub
		// �ж��Ƿ���ʱ������
		if (maxTime > 0) {
			while (true) {
				if (isBlack) {
					blackTime--;
					if (blackTime == 0) {
						JOptionPane.showMessageDialog(this, "�ڷ���ʱ,��Ϸ����!");
					}
				} else {
					whiteTime--;
					if (whiteTime == 0) {
						JOptionPane.showMessageDialog(this, "�׷���ʱ,��Ϸ����!");
					}
				}
				blackMessage = blackTime / 3600 + ":"
						+ (blackTime / 60 - blackTime / 3600 * 60) + ":"
						+ (blackTime - blackTime / 60 * 60);
				whiteMessage = whiteTime / 3600 + ":"
						+ (whiteTime / 60 - whiteTime / 3600 * 60) + ":"
						+ (whiteTime - whiteTime / 60 * 60);
				this.repaint();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(blackTime + " -- " + whiteTime);
			}
		}
	}

}

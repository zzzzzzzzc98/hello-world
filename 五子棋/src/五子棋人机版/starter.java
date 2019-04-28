package 五子棋人机版;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.InitialContext;
import javax.print.attribute.standard.Finishings;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class starter extends JFrame{
	JPanel j1=new JPanel();
	JPanel j2=new JPanel();
	JPanel j3=new JPanel();
	JButton startButton=new JButton("开始游戏");
	JButton aboutButton=new JButton("关于本程序");
	JTextArea va=new JTextArea("\n\n\n\n\n\n\n\n\n");
	JTextArea va1=new JTextArea("\n\n\n\n\n\n\n\n\n");
	JTextArea ha=new JTextArea("\t\t");
	JTextArea ha1=new JTextArea("\t\t");
	public starter() {
	    init();
		
	}
	public void init() {
		va.setEditable(false);
		va1.setEditable(false);
		j1.setLayout(new GridLayout(2,1));
		j2.setLayout(new BorderLayout());
		j1.add(startButton,BorderLayout.NORTH);
		j1.add(aboutButton,BorderLayout.SOUTH);
		j1.setSize(60, 60);
		add(va,BorderLayout.NORTH);
		add(j1,BorderLayout.CENTER);
		add(va1,BorderLayout.SOUTH);
		add(ha,BorderLayout.WEST);
		add(ha1,BorderLayout.EAST);
		//add(j2,BorderLayout.SOUTH);
		startButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				makesetting();
				repaint();
				// TODO 自动生成的方法存根
				
			}
		});
		setSize(600,600);
		setLocation(300,300);
		setVisible(true);
	}
	private void makesetting() {
		remove(j1);
		remove(j2);
		remove(j3);
		Action action=new Action();
		JButton b1=new JButton("人机模式");
		JButton b2=new JButton("双人对战");
		JButton b3=new JButton("退出游戏");
		setLayout(new GridLayout(3,1));
		add(b1);
		add(b2);
		add(b3);
		//getContentPane().repaint();
		b1.addActionListener(action);
		b2.addActionListener(action);
		b3.addActionListener(action);
		setSize(600,601);
	}
	class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("人机模式")) {
				fiveinarow f=new fiveinarow(true,true);
				f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
			if (e.getActionCommand().equals("双人对战")) {
				fiveinarow f=new fiveinarow(false,true);	
				f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

			}
			if (e.getActionCommand().equals("退出游戏")) {
				new Thread() {
					public void run() {setVisible(false);
						JOptionPane.showMessageDialog(null, "软件关闭,谢谢使用");
						
						System.exit(0);
					}
				}.start();
		       
				
			}
			// TODO 自动生成的方法存根
			
		}
		
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		fiveinarow five=new fiveinarow(false,false);
//		five.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		starter s=new starter();
		s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}

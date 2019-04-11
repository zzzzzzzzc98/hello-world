package Package6;

import java.awt.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;   
import javax.swing.*;  
public class C extends JApplet implements ActionListener 
{  
	public JTextField jt1, jt2;    
	public Button b;    
	public JPanel p; 
	public void init()// 界面的初始化  
	{
		resize(400, 300);   
		Container c = getContentPane();// 容器    
		c.setLayout(new BorderLayout());// 容器布局  
		p = new JPanel();// 容器面板     
		p.setLayout(new GridLayout(1, 3));// 格式布局   
		jt1 = new JTextField(10);      
		jt2 = new JTextField(10);  
		b = new Button("计算");    
		b.addActionListener(this);   
		p.add(jt1);     
		p.add(b);   
		p.add(jt2);    
		c.add(p, BorderLayout.CENTER);     
	}
		public void actionPerformed(ActionEvent e) // 按钮的事件监听器 
		{  
			Button source = (Button) e.getSource();  
			String whice = source.getLabel(); 
			if (whice.contentEquals("计算")){   
				String heat = jt1.getText();   
				Double a = Double.parseDouble(heat);   
					a = (a - 32) / 1.8;   
					jt2.setText(a.toString() + "°C");  
			}
		}
}
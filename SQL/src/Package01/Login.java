package Package01;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Login extends JFrame {
	private MyPanel panel;
	private JLabel l_acount = new JLabel("账号");
	private JTextField jta_text = new JTextField();
	private JLabel l_password = new JLabel("密码");
	private JPasswordField jtb_text = new JPasswordField();
	private JButton bt_register = new JButton("注册");
	private JButton bt_login = new JButton("登录");
	public static int pd = 0;
	public static String ak1,ak2;
	private Container contentPane = this.getContentPane();
	
	public Login() {
		this.setSize(400,267);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	    this.setTitle("登陆");
	    this.setResizable(false);
	    bt_register.addActionListener(new ActionListener() {
            @SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
                pd = 1;
                ak1 = jta_text .getText();
                ak2 = jtb_text .getText();
                String fileName = "users.dat";
                try {
                    FileWriter writer = new FileWriter(fileName,true);
                    BufferedWriter outWriter=new BufferedWriter(writer);
                    outWriter.write("ID:"+ak1+"&&"+"Password:"+ak2);
                    outWriter.newLine();
                    outWriter.close();
                    writer.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                jta_text.setText("");
                jtb_text.setText("");
                JOptionPane.showMessageDialog(null,"注册成功！ 您的用户名是："+ak1+"密码是："+ ak2);
            }
        });
	    
	    bt_login.addActionListener(new ActionListener() {
            @SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
            	
                if(pd==1||pd==0) {
                	File fileName=new File("users.dat");
                	try{
                	FileReader inOne=new FileReader(fileName);
                	BufferedReader inTwo=new BufferedReader(inOne);
                	String s=null;
                	int judge=1;
                	while((s=inTwo.readLine())!=null)
                	{
                	  StringBuilder stringBuilder = new StringBuilder();
						stringBuilder.append("ID:");
						stringBuilder.append(jta_text.getText());
						stringBuilder.append("&&");
						stringBuilder.append("Password:");
						stringBuilder.append(jtb_text.getText());
					String ak=stringBuilder.toString();
                	  
                	  
                      if(s.equals(ak)) {
                        JOptionPane.showMessageDialog(null, "登录成功！");
                        jta_text .setText("");
                        jtb_text .setText("");
                        judge=0;
                        
                        break;
                      }
                	}  
                	inTwo.close();
                    inOne.close();
                	if(judge==1) {
                         JOptionPane.showMessageDialog(null,"登陆失败！检查账号密码是否正确或请注册后登录",null,JOptionPane.ERROR_MESSAGE, null);
                         jta_text .setText("");
                         jtb_text .setText("");
                      }
                	 if(judge==0){
                	//new JMFMediaPlayer("JMF媒体播放器");  //在此处new出新的窗口
                		 dispose(); 
                		 return; 
                	 }
                	}catch(IOException event){
                		JOptionPane.showMessageDialog(null,"系统错误"+event,null,JOptionPane.ERROR_MESSAGE, null);
                	}
                }
            }
 
        });
	    init();
        
        panel = new MyPanel();
        //将所有的组件添加到panel面板中
        panel.add(l_acount);
        panel.add(l_password);
        panel.add(jta_text);
        panel.add(jtb_text);
        panel.add(bt_register);
        panel.add(bt_login);
        panel.setLayout(null);
         
        getContentPane().add(panel);
    }
    private void init() {
        l_acount.setSize(200,100);
        l_acount. setLocation(50,20);
        l_password.setSize(200,100);
        l_password.setLocation(50,80);
        jta_text.setSize(190,30);
        jta_text.setLocation(160,55);
        jtb_text.setSize(190,30);
        jtb_text.setLocation(160,115);
        bt_register.setSize(120, 40);
        bt_register.setLocation(60, 180);
        bt_login.setSize(120, 40);
        bt_login.setLocation(230, 180);
    }
     
    public static void main(String[] args)
    throws ClassNotFoundException,
        InstantiationException, IllegalAccessException,
        UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        new Login().setVisible(true);
    }
}


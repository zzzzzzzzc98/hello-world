package Package10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileCopy {
	public static void main(String[] args) {
		try {
			//读取文件内容
			FileInputStream fis=new FileInputStream("D:\\ch10\\file1.txt");
			BufferedInputStream bis=new BufferedInputStream(fis);
			//写文件内容
			FileOutputStream fos=new FileOutputStream("D:\\ch10\\file2.txt");
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			FileOutputStream fos1=new FileOutputStream("D:\\ch10\\file3.txt");
			BufferedOutputStream bos1=new BufferedOutputStream(fos1);
			FileOutputStream fos2=new FileOutputStream("D:\\ch10\\file4.txt");
			BufferedOutputStream bos2=new BufferedOutputStream(fos2);
			int len;
			byte[] b=new byte[1024];
			while((len=bis.read(b,0,1024))!=-1){
				bos.write(b,0,len);
				bos1.write(b,0,len);
				bos2.write(b,0,len);
			}			
			bis.close();
			bos.close();
			bos1.close();
			bos2.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

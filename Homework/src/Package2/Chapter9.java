package Package2;

import java.util.*;	

public class Chapter9 {
	//判断是不是素数
		public boolean isPrimeNum (int n) 
		{
	  		int i; 
	  		for (i = 2; i < n/2; i++) 
			{   
				if(n%i == 0)
	    			break;
	  		}
	  		if(i >= n/2)   
				return true;
	  			return false;
		}
	 
	 	//验证哥德巴赫猜想
	 	public void getGoldbachNum (int n) 
		{
	  		if(n < 6  ||  n%2 == 1)
	  		{
	   			System.out.println (n + "不满足哥德巴赫猜想!");
	   			return;
	  		}
	  		for(int i=2; i<= n-1; i++)
	  		{
	   			if(this.isPrimeNum(i) && this.isPrimeNum(n - i))
	   			{
	    				System.out.println (n + "=" + i + "+" + (n-i));
	    				break;
	   			}
	  		}
	 	}
	 
		public static void main (String[] args) 
		{  
			Chapter9 gc = new Chapter9();
	  		Scanner in = new Scanner(System.in); //创建输入流对象in 
	  	
	  		System.out.print ("输入需要验证的数(n>=6):");
	  		int n;
	  		n = in.nextInt();//输入n
	  
	  		gc.getGoldbachNum(n);//验证哥德巴赫猜想
	 	}
}

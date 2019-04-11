package Package7;

import java.util.*;

public class MyStack 
{
	private ArrayList data;
	
	public MyStack(){
		data = new ArrayList();		
	}

	public void push(Object o){
		data.add(o);
	}

	public Object pop(){
		int size = data.size();
		if(size>0)
			return data.remove(data.size()-1);
		else 
			return null;
	}

	public int getSize(){
		return data.size();
	}	
}

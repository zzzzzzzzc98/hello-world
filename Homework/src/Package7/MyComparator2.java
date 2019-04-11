package Package7;

import java.util.*;

public class MyComparator2 implements Comparator 
{
	public int compare(Object o1, Object o2){
		int num1 = ((Integer)o1).intValue();
		int num2 = ((Integer)o2).intValue();
		
		int type1 = num1%2;
		int type2 = num2%2;
		if(type1>type2)
			return -1;
		else if(type1<type2)
			return 1;
		else{
			if(type1==0){
				if(num1>num2)
					return -1;
				else if(num1<num2)
					return 1;
			}else if(type1==1){
				if(num1>num2)
					return 1;
				else if(num1<num2)
					return -1;
			}
		}
		return 0;
	}	
}

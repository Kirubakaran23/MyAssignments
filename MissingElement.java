package week4day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingElement {

	public static void main(String[] args) {
		int[] data= {1,2,4,5,6,7,8};
		Set<Integer> test=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
			test.add(data[i]);
			
		}
		System.out.println("Set is" +test);
		List<Integer> test1=new ArrayList<Integer>(test);
		System.out.println("List is" +test1);	
		Collections.sort(test1);
		System.out.println(test1);
	for(int j=0;j<test1.size();j++)
	{
	if(test1.get(j)!=j+1)
	{
		System.out.println(j+1);
		break;
	}		
}
	}
}

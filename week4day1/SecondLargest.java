package week4day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args) {
		int[] print= {40,20,70,30,60,90,110};
		Set<Integer> data=new TreeSet<Integer>();
		for(int i=0;i<print.length;i++)
		{
			data.add(print[i]);
		}
		System.out.println(data);
		System.out.println(data.size());
		List<Integer> test=new ArrayList<Integer>(data);
		System.out.println(test);	
		System.out.println(test.get(test.size()-2));

	}

}

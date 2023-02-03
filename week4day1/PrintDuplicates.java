package week4day1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] Print= {1,3,5,7,9,11,13,1,5,15,17,9,19};
		Arrays.sort(Print);
		Set<Integer> Print1=new TreeSet<Integer>();
		for(int i=0;i<Print.length-1;i++)
		{
			if(Print[i]==Print[i+1])
			{
				Print1.add(Print[i]);
		}}
		System.out.println(Print1);

	}

}

package week4day1;
import java.util.ArrayList;
import java.util.List;


public class FindIntersection {

	public static void main(String[] args) {
		int[] a={5,3,10,15,7,20};
		int[] b={1,3,7,15,9,20};
		
		List<Integer> Inter=new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			Inter.add(a[i]);
		}
		
		List<Integer> Inter1= new ArrayList<Integer>();
		
		for (int i = 0; i < b.length; i++) {
			Inter1.add(b[i]);
		}
		
		for (int i = 0; i < Inter.size(); i++) {
			for (int j = 0; j < Inter1.size(); j++) {
				
				if (Inter.get(i)==Inter1.get(j)) {
					System.out.println(Inter.get(i));

					
	}
			}		
		}
}
}
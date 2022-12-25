package week1.day1;

public class Calculator {
	
	public void subtwonumbers() {
		
		int a=5;
		int b=10;
		System.out.println(a-b);
	}
public int multitwonumbers(int a, int b) {
	
return a*b;

}
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.subtwonumbers();
		System.out.println(obj.multitwonumbers(2,3));

	}

}

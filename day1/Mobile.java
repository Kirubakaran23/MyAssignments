package week1.day1;

public class Mobile {

	public void makeCall() {
		String mobileModel="apple";
		float mobileWeight=4.2F;
		System.out.println("hai");
	} 
	public void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost=3567;
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Mobile obj = new Mobile ();
		obj.makeCall();
		obj.sendMsg();
		System.out.println("This is my Mobile");
	}
}

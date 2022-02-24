package week1.day2;

public class Mobile {
	
	
	public void makeCall() {
		
		System.out.println("Call");
	}
	public void  sendMsg() {
		
		System.out.println("sending message");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile pho=new Mobile();
		//object creation 
		pho.makeCall(); 
		// object created and calling the method 
		pho.sendMsg();
		
	}

}

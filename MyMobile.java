package week1.day2;

	public class MyMobile {

		public static void main(String[] args) {
			Mobile mob = new Mobile();
// calling the method from other class with same package as access modifier is public 
			mob.makeCall();
			mob.sendMsg();
		}

	}



package week1.day1;

public class Mobile {
	public void makeCall() {
		
		String mobileModel ="iphone 13 Pro";
		float mobileWeight =18.9f;
		System.out.println("mobile Model: "+ mobileModel);
		
		System.out.println("mobileWeight: " + mobileWeight);
	}

	public void sendMsg() {
	
		boolean isFullCharged =true;
		int mobileCost = 130000;
		System.out.println("is FullCharged :" + isFullCharged);
		System.out.println("mobileCost :" + mobileCost);
		
	}
 public static void main(String[] args) {
	 		Mobile mob = new Mobile();
	 		mob.makeCall();
			mob.sendMsg();
	System.out.println("This Is My Mobile");
}
}


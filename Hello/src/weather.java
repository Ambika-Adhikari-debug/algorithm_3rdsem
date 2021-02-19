
public class weather {
	public static void main(String[] args) {
		 boolean isSnowing =true;
		 boolean isRaining =false;
		 double temperature = 26;
		 
		 if(isSnowing || isRaining || temperature<50) {
			 System.out.println("Let's stay home");
		 }
		 else {
			 System.out.println("Let's go Out ");
		 }
		 
	}

}

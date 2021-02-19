package arrayinjava;

public class temperature {
	public static void main(String[] args) {
		
		double temp[] = {45.5,66,78.5,45,55,66};
		
		int size = temp.length;
		int y = 4;
		
		//use of for loop for single dimensional array
		for (int i=0; i<size; i++) {
			
			System.out.println(temp[i]);
		}
		
		//for each for single dimensional array
		for(double i:temp) {
			System.out.println(i);
		}
		
	}

}

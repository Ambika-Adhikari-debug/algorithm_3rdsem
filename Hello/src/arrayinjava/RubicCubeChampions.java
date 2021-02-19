package arrayinjava;

public class RubicCubeChampions {
	public static void main(String[] args) {
		double speed[]= {5,8,3.9,4,6.6,12,11,10.4};
		double result= findChampions(speed);
		System.out.println("Champion record is:"+result);
		
	}
	
	public static double findChampions(double speed[]) {
		
		int size = speed.length;
		double min = speed[0];
		for (int i=1; i<size; i++) {
			if (min>speed[i]) {
				min=speed[i];
			}
			
		}
		return min;
	}

}

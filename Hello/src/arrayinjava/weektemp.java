package arrayinjava;

public class weektemp {
	public static void main(String[] args) {
		double temp[] = {45.5,66,78.5,45,55,66,56};
		int avg=(int)calAvg (temp);
		System.out.println("Average Week temp is :" + avg);
		
	}
	
	public static double calAvg(double temp[]) {
		
		int size =temp.length;
		double total=0;
		for(int i=0; i<size; i++) {
			total= total+temp[i];
			
		
	}
		return total/size;

 }
	
}

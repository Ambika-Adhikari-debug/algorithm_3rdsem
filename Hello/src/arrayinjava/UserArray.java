package arrayinjava;
import java.util.Scanner;

public class UserArray {
	public static void main(String[] args) {
		
		//take input from user asking size of array
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		
		//create the array defining memory location(size)
		
		int random[] = new int[n];
	
		
		//insert the data into the array
		
		for(int i=0; i<random.length; i++) {
			System.out.println("Insert the random data on position "+i);
			random[i]=sc.nextInt();
		}
		
		//display the array
		
		for(int j:random) {
			System.out.println("Our data in array is"+j);
		}
	
	}
		

}

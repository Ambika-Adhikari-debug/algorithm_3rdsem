package twoDarray;

import java.util.Scanner;

public class twooD {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row: ");
		int rows = sc.nextInt(); 
		System.out.println("enter the column");
		int columns = sc.nextInt();
		int ua[][] = new int[rows][columns];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.println("insert item in "+ i+"th row"+j+"th column: ");
				ua[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(ua[i][j]);
				
			}
			System.out.println();
		}
		sc.close();
	}
}

	



package twoDarray;

public class Iteration {
	
	public static void main(String[] args) {
		int firstTable[][]= {{2,4,8},{6,8,7},{7,8,10} };
		
		int rows= firstTable.length;
		int columns= firstTable[0].length;
		
		//displaying 2D array using for loop
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(firstTable[i][j]+ " ");
			}
			System.out.println();
		} // i loop end
		
		
	}   
	

}

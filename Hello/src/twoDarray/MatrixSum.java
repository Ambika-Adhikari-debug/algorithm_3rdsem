package twoDarray;

public class MatrixSum {
	public static void main(String[] args) {
		int matA [][]= { {1,2},{3,4}};
		int matB [][]= { {5,6},{7,8}};
		
		int rows =matA.length;
		int columns= matA[0].length;
		
		int matSum [][] = new int[rows] [columns];
		
		//for loop
		for (int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				matSum[i][j]=matA[i] [j] + matB[i][j];
			}//end for j loop
		}//end for i loop
		
		//display sum
		System.out.println("Result after sum");
		for(int row[] : matSum) {
			for(int col : row) {
				System.out.print(col +" ");
			}
			System.out.println();
		}
	}

}

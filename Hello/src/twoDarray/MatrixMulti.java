package twoDarray;

public class MatrixMulti {
	public static void main(String[] args) {
		
		int matA[][] = { {1,2,3},{4,5,6} };
		int matB[][]= {{1,2},{3,4},{5,6}};
		
		int rows = matA.length;
		int columns = matB[0].length;
		
		int commonIndex = matB.length;
		
		int MatMul[][] = new int[rows] [columns];
		
		
		//calculation for multiplication
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				
				MatMul[i] [j]=0;
				
				for (int k=0; k<commonIndex; k++) {
					
				MatMul[i][j]+= matA[i][k] * matB[k][j];
				
				}//end for k loop	
		}	//end for j loop	
	  }//end for i loop
		
		//for each
		System.out.println("After Multiplication");
		
		for (int row[] : MatMul) {
			for (int col:row) {
				System.out.println(col +" ");
			}
			System.out.println();
		}
	
   } 
	
}

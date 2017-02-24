package week2;

public class MatrixPrint {

	public static void main(String[] args) {
		
		int counter = 0;
		
		int rows = 5;
		int cols = 5;
		int[][] matrix = new int[rows][cols];
		
		// Populate matrix
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < cols; j++) {
				
				matrix[i][j] = ++counter;
				
			}
			
		}
		
		// Reset counter
		counter = 0;
		
		// Print matrix
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < cols; j++) {
				
				if (++counter < 10) {
					System.out.print(" ");
				} 
				
				switch (matrix[i][j]) {
				case 1:
				case 5:
				case 7:
				case 9:
				case 13:
				case 17:
				case 19:
				case 21:
				case 25:
					if (counter > 10) {
						System.out.print(" ");
					} 
					System.out.print("*");
					break;
				default:
					System.out.print(matrix[i][j]);
				}
				
				System.out.print(" ");
				
			}
			
			System.out.print("\n");
			
		}
		
	}

}
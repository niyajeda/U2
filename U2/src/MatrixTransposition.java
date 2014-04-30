public class MatrixTransposition {
	public static int[][] transpose(int[][] matrix) {
		int[][] tmp = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
            	tmp[j][i] = matrix[i][j];
            }
        }
        return tmp;
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
		     for (int j = 0; j < matrix[i].length; ++j) {
		        System.out.print(matrix[i][j] + "\t");
		}
		 System.out.println("");
		}
	}

	public static void main(String[] args) {
		int[][] matrix = {{4,7,10,13},{5,8,11,14},{6,9,12,15}};
		System.out.println("Eingabe:");
		printMatrix(matrix);
		System.out.println("Ausgabe:");
		printMatrix(transpose(matrix));

	}
}
public class Matrix {
    private int[][] data; // Matrix array
        private int rows;     // Number of rows
        private int cols;     // Number of columns
    
        // Constructor to initialize the dimensions of the matrix
        public Matrix(int rows, int cols) {
            this.rows = rows;
            this.cols = cols;
            data = new int[rows][cols]; // Allocate memory for matrix
        }
    
        // Method to fill the matrix with values
        public void fillMatrix(int[][] values) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i < values.length && j < values[i].length) {
                        data[i][j] = values[i][j];
                    }
                }
            }
        }
    
        // Method to print the matrix to the console
        public void printMatrix() {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(data[i][j] + " ");
                }
                System.out.println(); // New line after each row
            }
        }
    
        // Main method for testing
        public static void main(String[] args) {
            // Create a 3x3 matrix
            Matrix matrix = new Matrix(3, 3);
            
            // Values to fill in the matrix
            int[][] values = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            // Fill the matrix
            matrix.fillMatrix(values);
    
            // Print the filled matrix
            matrix.printMatrix();
        }
    }
        
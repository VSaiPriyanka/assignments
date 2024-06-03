public class task4 {
    private int[][] data;
    private int rows;
    private int cols;

    public task4(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    public void fill(int[] values) {
        if (values.length != rows * cols) {
            throw new IllegalArgumentException("Number of values must match matrix dimensions");
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = values[i * cols + j];
            }
        }
    }

    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(this.data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        task4 matrix = new task4(3, 2);
        int[] values = {1, 2, 3, 4, 5, 6};
        matrix.fill(values);
        matrix.display();
    }
}
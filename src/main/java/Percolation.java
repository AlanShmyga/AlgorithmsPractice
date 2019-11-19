public class Percolation {

    private int[][] grid;

    /**
     * Creates n-by-n grid, with all sites blocked
     * @param n the size of the grid
     */
    public Percolation(int n) {
        if(n < 1) {
            throw new IllegalArgumentException("n must be grater than 0");
        }
        initGrid(n);
    }

    /**
     * Opens site (row, col) if it is not open already
     * @param row row of cell to open
     * @param col column of cell to open
     */
    public void open(int row, int col) {
        validateInputs(row, col);
        this.grid[row-1][col-1] = col;
    }

    /**
     * Checks if target cell is open
     *
     * @param row row of checking cell
     * @param col column of checking cell
     * @return is site (row, col) open?
     */
    public boolean isOpen(int row, int col) {
        validateInputs(row, col);
        return this.grid[row-1][col-1] > 0;
    }

    /**
     * Checks if target cell is full
     *
     * @param row row of checking cell
     * @param col column of checking cell
     * @return is site (row, col) full?
     */
    public boolean isFull(int row, int col) {
        validateInputs(row, col);
        return false;
    }

    /**
     * @return number of open sites
     */
    public int numberOfOpenSites() {
        int result = 0;
        for(int[] nestedArray : this.grid) {
            for(int cell : nestedArray) {
                if(cell > 0) {
                    result++;
                }
            }
        }
        return result;
    }

    /**
     * @return does the system percolate?
     */
    public boolean percolates() {
        return false;
    }

    public static void main(String[] args) {
        new Percolation(5);
    }

    private void initGrid(int n) {
        this.grid = new int[n][n];
        for(int i = 0; i < n; i++) {
            this.grid[i][i] = 0;
        }
        printGrid(n);
    }

    private void validateInputs(int row, int col) {
        if(row < 1 || row > grid.length) {
            throw new IllegalArgumentException("row index is out of grid size range");
        } else if (col < 1 || col > grid[0].length) {
            throw new IllegalArgumentException("cell index is out of grid size range");
        }
    }

    private void printGrid(int n) {
        for(int[] nestedArray : this.grid) {
            for(int cell : nestedArray) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
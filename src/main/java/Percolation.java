public class Percolation {

    private boolean[][] grid;

    public Percolation(int n) { // create n-by-n grid, with all sites blocked
        if(n < 1) {
            throw new IllegalArgumentException("n must be grater than 0");
        }
        initGrid(n);
    }

    public void open(int row, int col) { // open site (row, col) if it is not open already
        validateInputs(row, col);
    }

    public boolean isOpen(int row, int col) { // is site (row, col) open?
        validateInputs(row, col);
        return false;
    }

    public boolean isFull(int row, int col) { // is site (row, col) full?
        validateInputs(row, col);
        return false;
    }

    public int numberOfOpenSites() { // number of open sites
        return 0;
    }

    public boolean percolates() { // does the system percolate?
        return false;
    }

    public static void main(String[] args) { // test client (optional)
        new Percolation(5);
    }

    private void initGrid(int n) {
        this.grid = new boolean[n][n];
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
        for(boolean[] nestedArray : this.grid) {
            for(boolean cell : nestedArray) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
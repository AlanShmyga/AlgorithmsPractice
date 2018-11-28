public class PercolationStats {
    /**
     * perform trials independent experiments on an n-by-n grid
     * @param n size of grid
     * @param trials the number of experiment trials
     */
    public PercolationStats(int n, int trials) {
        validateInputs(n, trials);
    }

    /**
     * @return sample mean of percolation threshold
     */
    public double mean() {
        return 0.0;
    }

    /**
     * @return sample standard deviation of percolation threshold
     */
    public double stddev() {
        return 0.0;
    }

    /**
     * @return low  endpoint of 95% confidence interval
     */
    public double confidenceLo() {
        return 0.0;
    }

    /**
     * @return high endpoint of 95% confidence interval
     */
    public double confidenceHi() {
        return 0.0;
    }

    public static void main(String[] args) {
    }

    private void validateInputs(int n, int trials) {
        if(n < 1 || trials < 1) {
            throw new IllegalArgumentException("n and trials params must be grater than 0");
        }
    }
}
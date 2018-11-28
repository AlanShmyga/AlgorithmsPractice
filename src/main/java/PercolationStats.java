public class PercolationStats {
    /**
     * perform trials independent experiments on an n-by-n grid
     *
     * @param n      size of grid
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
        /*
        takes two command-line arguments n and T,
        performs T independent computational experiments (discussed above) on an n-by-n grid,
        and prints the sample mean, sample standard deviation, and the 95% confidence interval for the percolation threshold
        Use StdRandom to generate random numbers;
        use StdStats to compute the sample mean and sample standard deviation.

        Example
        % java-algs4 PercolationStats 200 100
        mean                    = 0.5929934999999997
        stddev                  = 0.00876990421552567
        95% confidence interval = [0.5912745987737567, 0.5947124012262428]
         */
    }

    private void validateInputs(int n, int trials) {
        if (n < 1 || trials < 1) {
            throw new IllegalArgumentException("n and trials params must be grater than 0");
        }
    }
}
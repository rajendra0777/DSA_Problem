class Solution {

    public int fib(int n) {
        if (n == 0)
            return 0;

        if (n == 1 || n == 2)
            return 1;

        int res1 = fib(n - 1);
        int res2 = fib(n - 2);
        return res1 + res2;

    }
    /*
    static int sum = 0;
    
    public int fib(int n) {
        return helper(n, 0, 1);
    }
    
    private static int helper(int n, int prev2, int prev1) {
        if (n == 0)
            return prev2;
        if (n == 1)
            return prev1;
    
        return helper(n - 1, prev1, prev1 + prev2);
    }
    */

}
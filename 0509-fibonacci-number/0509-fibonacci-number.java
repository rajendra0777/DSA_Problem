class Solution {
    static int sum = 0;

    public int fib(int n) {
        return helper(n, 0, 1);
    }
    private static int helper(int n, int prev2, int prev1) {
        if(n == 0) return prev2;
        if(n==1) return prev1;

       return helper(n-1, prev1, prev1+ prev2);
    }
}
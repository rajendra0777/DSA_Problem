/**
    Approach - Greedy Algorithem
    T.C. - O(N)
    S.C. - O(1)

 */

class Solution {
    public boolean canJump(int[] nums) {

        int maxJump = 0;
        for (int index = 0; index < nums.length; index++) {

            if (index > maxJump) {
                return false;
            }

            maxJump = Math.max(maxJump, index + nums[index]);
        }
        return true;
    }
}
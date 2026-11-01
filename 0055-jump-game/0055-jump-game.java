/**
    Approach - Greedy Algorithem
    T.C. - O(N)
    S.C. - O(1)

 */

class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        int maxJump = 0;
        for (int index = 0; index < nums.length; index++) {

            if (index > maxJump) {
                return false;
            }

            maxJump = Math.max(maxJump, index + nums[index]);

            if (maxJump > nums.length) {
                return true;
            }

            if(nums[index] == 0 && maxJump < index){
                return false;
            }
        }
        return true;
    }
}
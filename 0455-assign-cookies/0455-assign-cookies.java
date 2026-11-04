/*
Approach: Gtreedy with 2 Pointer
TC: O(N)
SC: O(1)

*/

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if (g.length == 0 || s.length == 0)
            return 0;

        Arrays.sort(g);
        Arrays.sort(s);

        int childPointer = 0;
        int cookiePointer = 0;

        while(childPointer <g.length && cookiePointer <s.length){
            if(s[cookiePointer]>=g[childPointer]){
                childPointer++; // this child is satisfied
            }
            cookiePointer++;
        }
        return childPointer;
    }
}

/*
There are absolutely no restrictions on the original sequence or positions of the children or cookies.
g = 7,8,9,10    
s = 5,6,7,8
*/
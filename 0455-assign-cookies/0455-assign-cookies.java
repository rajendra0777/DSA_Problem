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
g = 10,9,8,7
s = 5,6,7,8
*/
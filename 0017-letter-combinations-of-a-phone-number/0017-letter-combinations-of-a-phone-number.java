/*
Approach: iterative BFS (Breadth-First Search) or a level-by-level simulation
TC: O(3^a . 4^b . n); // a, b is the letter mapped with digit 3 and 4
SC: O(4^n  .n)
*/

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        String[] digitLetter = { " ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        if (digits.length() == 0)
            return result;

        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            result = combine(digitLetter[digits.charAt(i) - '0'], result);
        }
        return result;
    }

    private List<String> combine(String digit, List<String> list) {
        List<String> result = new ArrayList<>();

        for (int index = 0; index < digit.length(); index++) {
            for (String s : list) {
                result.add(s + digit.charAt(index));
            }
        }
        return result;
    }
}
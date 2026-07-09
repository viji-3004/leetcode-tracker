// Last updated: 09/07/2026, 10:07:25
class Solution {
    public int titleToNumber(String columnTitle) {
        long ans = 0;

    
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            ans = ans * 26 + (ch - 'A' + 1);
        }

        return (int) ans;
    }
}
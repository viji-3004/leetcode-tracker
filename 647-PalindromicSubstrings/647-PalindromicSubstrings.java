// Last updated: 09/07/2026, 10:06:17
class Solution {
    int check(String st,int i,int j) {
        int c = 0;
        int n = st.length();
        while(i>=0 && j<n) {
            if(st.charAt(i)==st.charAt(j)) {
                c++;
                i--;
                j++;
            }else{
                break;
            }
        }
        return c;
    }
    public int countSubstrings(String s) {
        int ans = 0;
        int n = s.length();
        for(int i=0;i<n;i++) {
            ans+=check(s,i,i);
            ans+=check(s,i,i+1);
        }
        return ans;
    }
}
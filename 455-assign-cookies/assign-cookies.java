class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int j=0;

        for (int i = 0; i < s.length; i++) {
            if(j>g.length-1) break;
            if(s[i]>=g[j]){
                count++;
                j++;
            }
        }
        return count;
    }
}
class Solution {
    public int findLongestChain(int[][] pairs) {

        if(pairs.length<=1){
            return pairs.length;
        }
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
      
        int lastEnd=pairs[0][1];
        int maxLength=1;

        for(int i=1;i<pairs.length;i++){
            if(lastEnd<pairs[i][0]){
                maxLength++;
                lastEnd=pairs[i][1];
            }
        }
        return maxLength;
    }
}
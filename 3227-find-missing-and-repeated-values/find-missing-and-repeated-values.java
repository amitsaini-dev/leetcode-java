class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int actualSum=0,expectedSum=0;
        HashSet<Integer>result=new HashSet<>();
        int res[]=new int[2];
        int a=0,b=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                actualSum+=grid[i][j];
                if(!result.add(grid[i][j])){
                    a=grid[i][j];
                    res[0]=a;
                }
            }
        }
        expectedSum=( (n*n) * (n*n+1) )/2;
        b=expectedSum+a-actualSum;
        res[1]=b;
        return res;
    }
}
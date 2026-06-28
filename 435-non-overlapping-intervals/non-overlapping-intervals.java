class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int arr[][]=new int[intervals.length][3];

        for(int i=0;i<arr.length;i++){
            arr[i][0]=i;
            arr[i][1]=intervals[i][0];
            arr[i][2]=intervals[i][1];
        }

        Arrays.sort(arr,Comparator.comparingDouble(o->o[2]));
        
        int overlapCount=0;
        int endVal=arr[0][2];
        for(int i=1;i<arr.length;i++){
            if(arr[i][1]>=endVal){
                endVal=arr[i][2];
            }else{
                overlapCount++;
            }
        }
        return overlapCount;
    }
}
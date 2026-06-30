class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);

        List<List<Integer>> minAbsPair=new ArrayList<>();

        int minAbsVal=Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++){
        minAbsVal=Math.min(minAbsVal,Math.abs(arr[i]-arr[i-1]));
        }
        
        for(int i=0;i<arr.length-1;i++){
            List<Integer> pair=new ArrayList<>();
            if(Math.abs(arr[i]-arr[i+1])==minAbsVal){
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                minAbsPair.add(pair);
            }
        }
        return minAbsPair;
    }
}
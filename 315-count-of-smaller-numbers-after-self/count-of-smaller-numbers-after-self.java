class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int[][] arr = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            arr[i][0] = nums[i]; // value
            arr[i][1] = i; // original index
        }

        int[] ans = new int[nums.length];

        int low = 0;
        int high = nums.length - 1;
        mergeSort(arr, low, high,ans);
        for(int i=0;i<ans.length;i++){
            list.add(ans[i]);
        }
        return list;
    }

    public void mergeSort(int nums[][], int low, int high, int ans[]) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(nums, low, mid, ans);
            mergeSort(nums, mid + 1, high, ans);
            merge(nums, low, mid, high, ans);
        }
    }

    public void merge(int nums[][],int low,int mid,int high,int ans[]){
        int i=low;
        int j=mid+1;
        int temp[][]=new int[high-low+1][2];
        int count=0;
        int inc=0;
        while(i<=mid &&j<=high){
            
            if(nums[i][0]>nums[j][0]){
                count++;
                
                temp[inc][0]=nums[j][0];
                temp[inc][1]=nums[j][1];
                inc++;
                j++;
            }else{
                ans[nums[i][1]]+=count;
                temp[inc][0]=nums[i][0];
                temp[inc][1]=nums[i][1];
                i++;
                inc++;
            }
        }
         while (i <= mid) {

        ans[nums[i][1]] += count;

        temp[inc] = nums[i];
        i++;
        inc++;
    }

    while (j <= high) {

        temp[inc] = nums[j];
        j++;
        inc++;
    }

    for (int k = 0; k < temp.length; k++) {
        nums[low + k] = temp[k];
    }
    }
}
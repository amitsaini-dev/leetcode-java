class Solution {
    public boolean lemonadeChange(int[] bills) {
        int arr[] = new int[3];
        //arr[0] means no. of 5 coins
        //arr[1] means no. of 10 coins
        //arr[2] means no. of 20 coins


        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                arr[0]++;
            } else if (bills[i] == 10) {
                arr[1]++;
                if(arr[0]>0){
                    arr[0]--;
                }else{
                    return false;
                }
            } else {
                if(arr[0]>0 && arr[1]>0){
                    arr[0]--;
                    arr[1]--;
                }else if(arr[0]>=3){
                    arr[0]-=3;
                }else{
                    return false;
                }
                arr[2]++;
            }
        }
        return true;
    }
}
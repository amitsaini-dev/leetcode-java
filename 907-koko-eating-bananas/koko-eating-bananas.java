class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int maxSpeed = Integer.MIN_VALUE;

        for (int i = 0; i < piles.length; i++) {
            maxSpeed = Math.max(maxSpeed, piles[i]);
        }

        int minSpeed = 1;

        while (minSpeed < maxSpeed) {
            int mid = minSpeed + (maxSpeed - minSpeed) / 2;
            long hour = hoursNeeded(piles, mid);
            if (hour <= h) {
                maxSpeed = mid;
            } else {
                minSpeed = mid+1;
            }
        }

        return minSpeed;
    }

    public long hoursNeeded(int piles[],int k){
        int hour=0;
        for(int i=0;i<piles.length;i++){
            hour+=(piles[i] + (long) k - 1) / k;
        }
        return hour;
    }
}

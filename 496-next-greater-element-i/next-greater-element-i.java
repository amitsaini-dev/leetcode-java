class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = new int[nums1.length];

        for (int i = nums2.length - 1; i >= 0; i--) {

            //Step 1
            while (!s.isEmpty() && nums2[s.peek()] < nums2[i]) {
                s.pop();
            }
            //Step 2
            if (s.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], nums2[s.peek()]);
            }
            s.push(i);
        }
        for (int i = 0; i < arr.length; i++) {
                arr[i] = map.get(nums1[i]);
        }
        return arr;
    }
}
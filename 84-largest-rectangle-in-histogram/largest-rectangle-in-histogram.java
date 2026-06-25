class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        Stack<Integer> s=new Stack<>();
        int nextSmallerRight[]=new int[heights.length];
        int nextSmallerLeft[]=new int[heights.length];

        //Next Smaller Right
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerRight[i]=heights.length;                
            }else{
                nextSmallerRight[i]=s.peek();
            }
            s.push(i);
        }
        //Next Smaller left
        s=new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerLeft[i]=-1;                
            }else{
                nextSmallerLeft[i]=s.peek();
            }
            s.push(i);
        }
        //Calculate Area 
        for(int i=0;i<heights.length;i++){
            int height=heights[i];
            int width=nextSmallerRight[i]-nextSmallerLeft[i]-1;
            int area=height*width;
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
}
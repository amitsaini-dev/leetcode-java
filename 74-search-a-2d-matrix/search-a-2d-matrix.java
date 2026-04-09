class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        int rowToBeSeached=-1;
        
        if(target>matrix[endRow][endCol] || target<matrix[0][0] ){
            return false;
        }

        while(startRow<=endRow){

            int mid=startRow+(endRow-startRow)/2;
            if(target>matrix[mid][endCol]){
                startRow=mid+1;
            }
            else if(target < matrix[mid][0]){
                endRow=mid-1;
            }
            else{
                rowToBeSeached=mid;
                break;
            }
        }
        if(rowToBeSeached == -1){
            return false; 
        }

        int low=0;
        int high=matrix[0].length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==matrix[rowToBeSeached][mid]){
                return true;
            }
            else if(target>matrix[rowToBeSeached][mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;      
    }
}
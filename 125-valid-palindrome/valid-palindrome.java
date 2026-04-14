class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String res=sb.toString();
        int i=0;
        int j=res.length()-1;
        while(i<j){
            if(res.charAt(i)!=res.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
class Solution {
    public String capitalizeTitle(String title) {
        
        title=title.toLowerCase();
        String words[]=title.split(" ");

        for(int i=0;i<words.length;i++){
            if(words[i].length()>2){

                // words[i]=words[i].toLowerCase();
                StringBuilder sb=new StringBuilder(words[i]);
                sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
                words[i]=sb.toString();
            }
            else{
                words[i]=words[i].toLowerCase();
            }
        }
        StringBuilder titleStr=new StringBuilder("");
            for(String word:words){
                titleStr.append(word).append(" ");
            }
        return titleStr.toString().trim();
    }
}
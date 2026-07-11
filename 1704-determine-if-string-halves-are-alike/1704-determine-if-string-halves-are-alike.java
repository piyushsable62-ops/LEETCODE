class Solution {
    public boolean halvesAreAlike(String s) {
        String ans = s.toLowerCase();
        int n = s.length();
        int count1 = 0;
        int count2 = 0;
        for(int i = 0;i<n/2;i++){
            int char1 = ans.charAt(i);
            if(char1 == 'a'  || char1 == 'e'  || char1 == 'i' || char1 == 'o' || char1 =='u'){
                count1++;
            }
            
        }for(int i = n/2;i<n;i++){
            int char1 = ans.charAt(i);
            if(char1 == 'a'  || char1 == 'e'  || char1 == 'i' || char1 == 'o' || char1 =='u'){
                count2++;
            }
            
        }
        if(count1 == count2){
            return true;
        }
        return false;
    }
}
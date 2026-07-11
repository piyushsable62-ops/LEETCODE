class Solution {
    public boolean judgeCircle(String moves) {
        int x =0;
        int y = 0;
        
        for(int i = 0;i<moves.length();i++){
             char ans = moves.charAt(i);
            if(ans == 'U'){
                x++;

            }else if(ans == 'D'){
                x--;
            }else if (ans == 'L'){
                y++;
            }else{
                y--;
            }
        }
        return x==0 && y==0;
        
    }
}
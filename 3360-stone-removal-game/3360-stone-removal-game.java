class Solution {
    public boolean canAliceWin(int n) {
        int count = 0;
        int minus = 10;
        if(n<10){
            return false;
        }
        while(n>=0){
        n = n-minus;
        minus = minus-1;
        count++;
        if(n<0){
            if(count%2 == 1){
                return false;
            }else{
                return true;
            }
        }

        }
        return true;
    }
}
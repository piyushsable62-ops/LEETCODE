class Solution {
    String ans = "0";
    int i = 1;
    public char findKthBit(int n, int k) {
    if(n == 1){
        return '0';
    }
    while(i<=n){
        String ans1 = ans;
        char[] list = ans.toCharArray();
        for(int j = 0;j<list.length;j++){
        if(list[j] == '0'){
            list[j] = '1';
        }else{
            list[j] = '0';
        }
        }
        int m = 0;
        int p = list.length-1;
        while(m<p){
            char temp = list[m];
            list[m] = list[p];
            list[p] = temp;
            m++;
            p--;
        }
         String ans2 = new String(list);
        ans = ans +"1"+ans2;
        ans1 = ans2;
        i++;
    } 
    return ans.charAt(k-1);
    }
    }

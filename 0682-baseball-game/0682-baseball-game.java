class Solution {
    public int calPoints(String[] game) {
        Stack<Integer> list = new Stack<>();
       list.push(Integer.parseInt(game[0]));
        for(int i = 1;i<game.length;i++){
        String ans = game[i];
        if(ans.equals("C")){
            list.pop();
        }
        else if(ans.equals("D")){
            int ans5 = list.pop();
            list.push(ans5);
            list.push(2*ans5);
        }else if(ans.equals("+")){
            int ans1 = list.pop();
            int ans2 = list.pop();
            int sum = ans1+ans2;
            list.push(ans2);
            list.push(ans1);
            list.push(sum);
        }else{
            list.push(Integer.parseInt(ans));
        }
        }
        int sum = 0;
        while(list.size() != 0){
            sum+=list.pop();
        }
        return sum;
        
    }
}
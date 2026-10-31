class Solution {
    public List<List<String>> solveNQueens(int n) {
      ArrayList<List<String>> List = new ArrayList<>();
      char[][] chess = new char[n][n];
      for(int i = 0;i<n;i++){
        for(int j = 0;j<n;j++){
            chess[i][j] = '.';
        }
      }
      game(List,chess,0);
      return List;
    }
    public void game( ArrayList<List<String>> List, char[][] chess,int row){
        int n = chess.length;
        if(row == n){
            ArrayList<String> ans = new ArrayList<>();

            for (int i = 0; i < n; i++) {
            ans.add(new String(chess[i]));
        }
        List.add(ans);
        return;
        }
        for(int i = 0;i<n;i++){
            if(queen(row,i,chess)){
                chess[row][i] = 'Q';
                game(List,chess,row+1);
                chess[row][i] = '.';
            }
        }

    }
    public boolean queen(int row ,int col,char[][] chess){
        int j = chess.length-1;
   
        while(j>=0){
            if(chess[j][col] == 'Q'){
                return false;
            }
            j--;
        }
       j = row-1;
       int i = col-1;
       while(j>=0 && i>=0){
        if(chess[j][i] == 'Q'){
            return false;
        }
        i--;
        j--;
       } 
        j = row-1;
       i = col+1;
       while(j>=0 && i<chess.length){
        if(chess[j][i] == 'Q'){
            return false;
        }
        i++;
        j--;
       }
       return true;
    }
}
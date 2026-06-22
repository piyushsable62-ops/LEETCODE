class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        int t = m*n;
        int firstrow = 0;
        int firstcol = 0;
        int lastrow = m-1;
        int lastcol = n-1;
        while(list.size()<t){
           
        for(int j = firstcol ;j <= lastcol ;j++   ){
                list.add(arr[firstrow][j]);
            }
            firstrow++;

         if(list.size() == t) break;
        for(int i = firstrow;i <= lastrow;i++){
                list.add(arr[i][lastcol]);
            }
            lastcol--;
            if(list.size() == t) break;
            for(int j = lastcol  ;j >= firstcol ;j--   ){
                list.add(arr[lastrow][j]);
            }
            lastrow--;
            if(list.size() == t) break;
        for(int i = lastrow;i>= firstrow ;i--   ){
                list.add(arr[i][firstcol]);
            }
            firstcol++;
        }
        return list;
}
        
    }
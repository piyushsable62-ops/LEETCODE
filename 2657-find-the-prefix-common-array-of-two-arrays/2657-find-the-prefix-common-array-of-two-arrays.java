class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] ans = new int[A.length];
        int count = 0;
        int[] list = new int[A.length];

        for(int i = 0; i < ans.length; i++){
            int a = A[i];
            int b = B[i];

            if(a == b){
                count++;
            }
            else{
                if(ans[a-1] != 0){
                    count++;
                }

                if(ans[b-1] != 0){
                    count++;
                }
            }

            ans[a-1] = 1;
            ans[b-1] = 1;

            list[i] = count;
        }

        return list;
    }
}
import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int p =0;
        int[] ans = new int[m+n];
        while(i<m && j< n){
            if(nums1[i] > nums2[j]){
                ans[p] = nums2[j];
                j++;
                p++;
                }else{
                    ans[p] = nums1[i];
                    i++;
                    p++;
                }
        }
        while(i<m){
            ans[p++] = nums1[i++];
        }while(j<n){
            ans[p++] = nums2[j++];
        }
        i = 0;
        for(int k = 0 ;k<ans.length;k++){
            nums1[i] = ans[i];
            i++;
        }

        // for (int i = 0; i < n; i++) {
        //     nums1[m] = nums2[i];
        //     m++;
        // }

        // Arrays.sort(nums1);
    }
}
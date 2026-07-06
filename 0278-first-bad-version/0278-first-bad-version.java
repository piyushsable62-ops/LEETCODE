/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i = 0;
        int j = n;
        int x = -1;
        while(i<=j){
            int mid = (j-i)/2+i;
            if(!isBadVersion(mid)){
                i = mid+1;
            }else{
                x = mid;
                j = mid-1;
            }
        }
        return x;
        
    }
}
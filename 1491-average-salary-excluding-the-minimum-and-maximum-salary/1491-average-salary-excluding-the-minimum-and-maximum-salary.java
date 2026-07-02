class Solution {
    public double average(int[] salary) {
        int sum = 0;
        int count = 0;
        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<salary.length;i++){
            if(salary[i] > max){
                max = salary[i];
            }
        }for(int i = 0;i<salary.length;i++){
            if(salary[i] < min){
                min = salary[i];
            }
        }
        for(int i = 0;i<salary.length;i++){
         if(salary[i]!= min && salary[i] != max){
         sum+=salary[i];
         }
        }
        return (double)sum/(salary.length-2);
        
    }
}
// class Solution {
//     public double average(int[] salary) {
//         int sum = 0;
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;

//         for (int s : salary) {
//             sum += s;
//             max = Math.max(max, s);
//             min = Math.min(min, s);
//         }

//         return (double) (sum - max - min) / (salary.length - 2);
//     }
// }
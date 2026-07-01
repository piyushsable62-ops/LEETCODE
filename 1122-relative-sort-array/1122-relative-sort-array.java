class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        ArrayList<Integer> list = new ArrayList<>();

        boolean[] used = new boolean[arr1.length];

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {   
                    list.add(arr1[j]);
                    used[j] = true;
                }
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!used[i]) {
                list.add(arr1[i]);
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = list.get(i);
        }

        return arr1;
    }
}
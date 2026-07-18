import java.util.*;

class Solution {

    int count = 0;

    public int numTilePossibilities(String tiles) {

        char[] arr = tiles.toCharArray();
        Arrays.sort(arr);

        boolean[] used = new boolean[arr.length];
        ArrayList<Character> list = new ArrayList<>();

        helper(arr, used, list);

        return count;
    }

    public void helper(char[] arr, boolean[] used, ArrayList<Character> list) {

        for (int i = 0; i < arr.length; i++) {

            if (used[i]) {
                continue;
            }

            if (i > 0 && arr[i] == arr[i - 1] && !used[i - 1]) {
                continue;
            }

         
            used[i] = true;
            list.add(arr[i]);
            count++;

            System.out.println(list);

            helper(arr, used, list);

            // Backtrack
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}
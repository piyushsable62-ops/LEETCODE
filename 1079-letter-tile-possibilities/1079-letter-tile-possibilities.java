import java.util.Arrays;

class Solution {

    int count = 0;

    public int numTilePossibilities(String tiles) {

        char[] arr = tiles.toCharArray();
        Arrays.sort(arr);              // To handle duplicates
        boolean[] used = new boolean[arr.length];

        helper(arr, used);

        return count;
    }

    public void helper(char[] arr, boolean[] used) {

        for (int i = 0; i < arr.length; i++) {

            // Tile already used
            if (used[i]) {
                continue;
            }

            // Skip duplicate tiles
            if (i > 0 && arr[i] == arr[i - 1] && !used[i - 1]) {
                continue;
            }

            used[i] = true;
            count++;

            helper(arr, used);

            used[i] = false;   // Backtrack
        }
    }
}
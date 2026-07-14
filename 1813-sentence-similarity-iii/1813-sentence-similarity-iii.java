class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {

        // Split the sentences into words
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");

        // Make sure s1 is the longer sentence
        if (s1.length < s2.length) {
            String[] temp = s1;
            s1 = s2;
            s2 = temp;
        }

        // Match words from the beginning
        int i = 0;
        while (i < s2.length && s1[i].equals(s2[i])) {
            i++;
        }

        // Start from the last word of both sentences
        int j1 = s1.length - 1;
        int j2 = s2.length - 1;

        // Match words from the end
        while (j2 >= i && s1[j1].equals(s2[j2])) {
            j1--;
            j2--;
        }

        // If all words of the shorter sentence are matched
        return j2 < i;
    }
}
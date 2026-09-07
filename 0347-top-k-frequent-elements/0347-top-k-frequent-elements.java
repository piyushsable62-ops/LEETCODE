import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // 2. Min heap: {frequency, element}
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int ele = entry.getKey();
            int freq = entry.getValue();
            pq.add(new Pair(ele, freq));
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().ele;
        }
        return ans;
    }
}
class Pair implements Comparable<Pair> {
    int ele;
    int freq;
    Pair(int ele, int freq) {
        this.ele = ele;
        this.freq = freq;
    }
    // @Override
    public int compareTo(Pair p) {
        // Smaller frequency comes first
        return this.freq - p.freq;
    }
}
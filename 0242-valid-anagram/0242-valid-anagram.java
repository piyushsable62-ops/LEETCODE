class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer> ans = new HashMap<>();
        if (s.length() != t.length()) {
        return false;
        }
       for(char ele : s.toCharArray()){
       ans.put(ele,ans.getOrDefault(ele,0)+1);
       }
        for (char ele : t.toCharArray()) {
        if(!ans.containsKey(ele)){
         return false;
        }
        ans.put(ele, ans.get(ele) - 1);
        int freq = ans.get(ele);
        if(freq == 0 ){
            ans.remove(ele);
        }
            
        }
        return true;
       }

    
}
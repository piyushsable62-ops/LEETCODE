class Solution {
    public int calculate(String s) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ans = s.charAt(i);
            if (ans == ' ') {
                continue;
            } else if (ans == '+' || ans == '-') {
                st2.add(ans);
            } else if (ans == '*') {
                int t = st1.pop();
                i++;
                while (i < s.length() && s.charAt(i) == ' ') {
                    i++;
                }
                int p = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    p = p * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                int ans1 = t * p;
                st1.push(ans1);
            } else if (ans == '/') {
                int t = st1.pop();
                i++;
                while (i < s.length() && s.charAt(i) == ' ') {
                    i++;
                }
                int p = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    p = p * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                int ans1 = t / p;
                st1.push(ans1);
            } else {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                st1.push(num);
            }
        }
        Stack<Character> temp = new Stack<>();
        while (!st2.isEmpty()) {
            temp.push(st2.pop());
        }
        int result = st1.get(0);
        for (int i = 1; i < st1.size(); i++) {
            char op = temp.pop();
            int t = st1.get(i);
            if (op == '+') {
                result = result + t;
            } else {
                result = result - t;
            }
        }
        return result;
    }
}
class CustomStack {
 Stack<Integer> st;
 int max;
    public CustomStack(int maxSize) {
       st = new Stack<>();
        max = maxSize;
    }
    
    public void push(int x) {
        if(st.size()<max){
            st.push(x);
        }
        
    }
    
    public int pop() {
       if(st.size() == 0){
        return -1;
       } 
       return st.pop();
    }
    
    public void increment(int k, int val) {
        if(k > st.size()){
             Stack<Integer> temp = new Stack<>();
            while(st.size() > 0){
           
            int ans = val+st.pop();
            temp.push(ans);
            }
            while(temp.size()>0){
                st.push(temp.pop());
            }
        }else{
            int count = st.size()-k;
            int i = 0;
            Stack<Integer> temp = new Stack<>();
            Stack<Integer> temp1 = new Stack<>();
            while(i<count && st.size()>0){
            temp.push(st.pop());
            i++;
            }
            while(st.size()>0){
                temp1.push(st.pop()+val);
            }
            while(temp1.size()>0){
                st.push(temp1.pop());
            }
            while(temp.size()>0){
                st.push(temp.pop());
            }
            
        }
    }
}



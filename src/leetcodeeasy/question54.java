package leetcodeeasy;

import java.util.ArrayList;
/*
 * Accepted
nimo22
nimo22
submitted at Jan 11, 2024 11:08
Runtime
0ms
Beats100.00%of users with Java
Memory
40.88MB
Beats43.36%of users with Java
 */
public class question54 {
    class MyQueue {
        ArrayList<Integer> q= new ArrayList<>();
        public MyQueue() {
            
        }
        
        public void push(int x) {
            q.add(x);
            
        }
        
        public int pop() {
            int i=q.get(0);
            q.remove(0);
            return i;

        }
        
        public int peek() {
            
            return q.get(0);
        }
        
        public boolean empty() {
            
            return q.isEmpty();
        }
    
}
}

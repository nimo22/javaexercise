package leetcodeeasy;

import java.util.*;
/*
 * Accepted
nimo22
nimo22
submitted at Jan 11, 2024 08:36
Runtime
0ms
Beats100.00%of users with Java
Memory
40.89MB
Beats41.34%of users with Java
 */

//https://leetcode.com/problems/implement-stack-using-queues/description/
public class question50 {
    class MyStack{
        List<Integer> li= new ArrayList<>();
        public MyStack() {
            this.li=li;
        }
        
        public void push(int x) {
            li.add(x);
            
        }
        
        public int pop() {
        int ret =li.get(li.size()-1);
        this.li.remove(li.size()-1);
            
         return ret;   
        }
        
        public int top() {

            return li.get(li.size()-1);
        }
        
        public boolean empty() {

            return li.isEmpty();
        }
    }
    
    /**
     * Your MyStack object will be instantiated and called as such:
     * MyStack obj = new MyStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */
    
}

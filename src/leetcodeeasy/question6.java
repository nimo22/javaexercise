package leetcodeeasy;
import java.util.*;
//https://leetcode.com/problems/valid-parentheses/
public class question6 {

    /*
     * first approch i had a stack idea in mind but didnt approve it since i am focus alot of array and for loop
     */
//     public static boolean isValid(String s) {
//         boolean responseOne=true;//()
//         boolean responseTwo=true;//[]
//         boolean responseThree=true;//{}
//         String lastThing="";
//         char []ar=s.toCharArray();
//         int addone=0;
//         int addtwo=0;
//         int addthree=0;
       
      
//        for(int i=0;i<ar.length;i++){
//         if(ar[i]=='('){
//             responseOne=false;
//             lastThing="(";
            
//         }
//         if(ar[i]==')'){
            
//             if(responseOne==false && (lastThing=="("|| lastThing=="") ){
//               lastThing="";
//                 responseOne=true;
//             }else{
                
//                 responseOne=false;
//                 break;
//             }
//         }
//         //[]
//          if(ar[i]=='['){
//             responseTwo=false;
//              lastThing="[";
//              addone++;

//         }
//         if(ar[i]==']'){
//             if((responseTwo==false ||addone>1)  && (lastThing=="["|| lastThing=="")){
//                 responseTwo=true;
//                 lastThing="";
//                 addone--;
//             }else{
//                 System.out.println(2);
//                 responseTwo=false;
//                 break;
//             }
//         }
//         // {}
//           if(ar[i]=='{'){
//             responseThree=false;
//             lastThing="{";
//         }
//         if(ar[i]=='}'){
//             if(responseThree==false && (lastThing=="{" || lastThing=="")  ){
//                 responseThree=true;
//                 lastThing="";
//             }else{
//                 responseThree=false;
//                 break;
//             }
//         }
        
        
//     }
//     System.out.println(addone);
//     if(addone!=0||addtwo!=0||addthree !=0){
//         responseOne=false;
//     }
    
//   return (responseOne&&responseTwo&&responseThree);  
// }


// second approch
/*
 * Runtime
Details
1ms
Beats 98.63%of users with Java
Memory
Details
41.94MB
Beats 5.90%of users with Java
 */
public static boolean isValid(String s) {
    boolean response= false;
    char []ar=s.toCharArray();
    List <Character>arr= new ArrayList<>();
    for(int i=0;i<ar.length;i++){
        if(ar[i]=='{'){
            arr.add('{');
        }else  if(ar[i]=='('){
            arr.add('(');
        }else  if(ar[i]=='['){
            arr.add('[');
        }else 
        if(ar[i]=='}' && arr.size()!=0 && arr.get(arr.size()-1)=='{'){
            response =true;
            arr.remove(arr.size()-1);
        }else 
        if(ar[i]==']' && arr.size()!=0 && arr.get(arr.size()-1)=='['){
            response =true;
            arr.remove(arr.size()-1);
    }else
    if(ar[i]==')' && arr.size()!=0 && arr.get(arr.size()-1)=='('){
            response =true;
            arr.remove(arr.size()-1);
    }else {
        response=false;
        break;
    }
}
    if(!arr.isEmpty()){
        response=false;
    }

    return response;
}

// solution two using filo stack
/*
 * Runtime
Details
1ms
Beats 98.63%of users with Java
Memory
Details
41.99MB
Beats 5.90%of users with Java
 */
public static boolean isValidTwoo(String s) {
    boolean response=false;
    Stack <Character> st= new Stack<>();
    char []ch= s.toCharArray();
    for(int i=0;i<ch.length;i++){
        System.out.println(st.size());
        if (ch[i]!=')' && ch[i]!='}' && ch[i]!=']') {     
            st.push(ch[i]);
            
        }
        else if(ch[i]=='}' &&!st.isEmpty() && st.peek()=='{' ){
            System.out.println(1);
            response=true;
            st.pop();
        }else  if(ch[i]==']' && st.peek()=='['&&st.size()!=0){
            response=true;
            st.pop();
        } else  if(ch[i]==')' && st.peek()=='('&&st.size()!=0){
            response=true;
            st.pop();
            
        }else {
            System.out.println(3);
            response=false;
            break;
        }

    }
    if(!st.isEmpty()){
        response=false;
    }

    return response;
}

public static void main(String[] args) {
    String x="([]){";
    System.out.println(isValidTwoo(x));
}
}

import java.util.*;

class fibonacci{
    
    public ArrayList<Integer> fibo(int first,int seconde,int sizeOfArray){
        ArrayList <Integer> fib = new ArrayList<Integer>();
        
        fib.add(first);
        fib.add(seconde);
        for(int i=2;i<sizeOfArray;i++){
            int len=fib.size();
            //System.out.println(len);
            int num=fib.get(len-1)+fib.get(len-2);
            fib.add(num);
        }
    

    return fib;
    }
}
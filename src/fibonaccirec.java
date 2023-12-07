

public class fibonaccirec {

    
    public void printfib(int f,int s){
        if(f==0&&s==1){
            System.out.println(f+"\n"+s);
            printfib(1, 1);
        }else{
            int number=f+s;
            if(number<222){
            System.out.println(number);
            
            printfib(s, number);
            }
        }

    } 
    
}

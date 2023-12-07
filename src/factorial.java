public class factorial {

    boolean first=true;
    int total=0;
    public int printfac(int number){
        
        if (number!=0) {
        
            total=number*printfac(number-1);
            
           return total; 
        }else{
            
            return 1;
        }
        
    }
}

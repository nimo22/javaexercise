/**
 * pyramidedown
 */
public class pyramidedown {
    int fix;
    boolean first=true;

    public void rev(int number){
        if (first) {
            fix=number;
            first=false;
        }
    if (number==0) {
        return;
    }
    for(int i=number;i<fix;i++){
        System.out.print(" ");
    }
    for(int i=0;i<number;i++){
        System.out.print(number+" ");
    }
    System.out.print("\n");
    number--;
    rev(number);
    
    }
}
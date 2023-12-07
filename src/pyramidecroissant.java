/**
 * pyramidecroissant
 */
public class pyramidecroissant {

    
    int fix;
    boolean first=true;

    public void print(int colom){

        if (first) {
            fix =colom;
            first=false;
        }
        if (colom<1) {
            return;
        }

        
        for(int i=colom;i<fix;i++){
            System.out.print(" ");
        }
        for(int i=1;i<colom+1;i++){
            System.out.print(i+" ");
        }
        
        System.out.println("");
        print((colom-1));

    }
}
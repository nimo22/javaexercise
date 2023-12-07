import java.util.ArrayList;

public class sameelementarray {

    
    public<T> boolean sameElement(ArrayList<T> first ,ArrayList<T>second){
        boolean bal= true;
        if(first.size()>second.size()){
            ArrayList <T> n = new ArrayList<>();
            n=second;
            first=second;
            second=n;
        }
        for (int i=0;i<first.size();i++){
            bal=false;
            for(int r=0;r<second.size();r++){
                if (first.get(i)==second.get(r)) {
                    bal=true;
                }
            }
            if (bal==false) {
                return bal;
            }
            
        }

        return bal; 

    }
    
}

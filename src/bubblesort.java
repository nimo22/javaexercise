import java.util.ArrayList;

/**
 * bubblesort
 */
public class bubblesort {

    
    public ArrayList<Integer> bubble(ArrayList<Integer> lis){
        for(int i=0;i<lis.size();i++){

            for(int r=0;r<lis.size();r++){
                if (r+1==lis.size()) {
                    
                }else
                if (lis.get(r)>lis.get(r+1)) {
                    int grand=lis.get(r);
                     lis.set(r, lis.get(r+1));
                     lis.set(r+1, grand);
                }
            }
        }
        return lis;
    }
}
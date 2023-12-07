import java.util.ArrayList;

public class onlyodd {

    public boolean onlyod(ArrayList<Integer>l){
        boolean ret=true;
        if(l.size()==0){
            throw new ArithmeticException("ARRAYS IS EMPTY");
        }else{
            for (int i=0;i<l.size();i++){
                if (l.get(i)%2==0) {
                    ret=false;
                    break;
                }
            }
        }

        return ret;
    }
    
}

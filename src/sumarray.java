import java.util.ArrayList;

public class sumarray {


    public void sum(ArrayList<Integer> a){
        int sum=0;
        if (a.size()==0) {
            return;
        }
        for(int i=0;i<a.size();i++){
            sum=sum+a.get(i);
        }
        System.out.println(sum);
    }
    
}

import java.util.ArrayList;

public class secondelarger {


    public void secondelarger(ArrayList<Integer>sec){
        ArrayList<Integer> seco= new ArrayList<>();
        seco=sec;
        int position=0;
        int larg=seco.get(0);
        for(int i=0;i<seco.size();i++){
            if (larg<seco.get(i)) {

                larg=seco.get(i);
                position=i;
            }
        }
        seco.remove(position);
        larg=0;
          for(int i=0;i<seco.size();i++){
            if (larg<seco.get(i)) {

                larg=seco.get(i);
                position=i;
            }
        }
    System.out.println(larg);
    }
    
}

import java.util.ArrayList;

/**
 * mergesort
 */
public class mergesort {


    public void  merge(ArrayList<Integer> arry){

        if (arry.size()<2){
            return;
        }
        int midle = arry.size()/2;
        ArrayList<Integer> left= new ArrayList<>();
        ArrayList<Integer>right= new ArrayList<>();
        for(int i=0;i<midle;i++){
            left.add(arry.get(i));
        }
        for (int i=midle;i<arry.size();i++){
            right.add(arry.get(i));
        }
        merge(left);
        merge(right);
        fixit(arry,left,right);
    }
        public void fixit(ArrayList<Integer>arry,ArrayList<Integer>left,ArrayList<Integer>right){

        int a,l,r;
        a=0;
        r=0;
        l=0;
        int leftsize=left.size();
        int rightsize=right.size();

        while (l<leftsize&& r<rightsize) {
            if (left.get(l)<right.get(r)) {
                arry.set(a, left.get(l));
                l++;
            }else{
            arry.set(a, right.get(r));
            r++;
            }
            a++;           
        }

        if(l<leftsize){
            for(int i=l;i<leftsize;i++){
                arry.add(left.get(i));
                l++;
               // a++;
                
            }
             if(r<rightsize){
            for(int i=r;i<rightsize;i++){
                arry.add(right.get(i));
                r++;
              //  a++;
            }
        }

        }
    
            }
        }

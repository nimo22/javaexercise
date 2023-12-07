public class fibonaccicountreco {
    int f=0;
    int s=1;
    int r;
    boolean check=true;

    public void printd(int iteration ){
        
        if (check) {
            System.out.println("0"+'\n'+"1");
            check=false;
        }
        if (iteration!=2){
            iteration--;
            System.out.println(f+s);
            int t=s;
            s=f+s;
            f=t;
            printd(iteration);
        }

    }
    
}

public class pyramide {

     int original;
    boolean first= true;
    public void createpyramide(int stone){
        if (first) {
            original=stone;
            first=false;
        }
       if (stone ==0){
        return;
       }
       
       createpyramide(stone-1);
       for(int i=0;i<original-1;i++){
        System.out.print(" ");
       }
       original--;
       for(int i=0;i<stone;i++){
        System.out.print(stone+" ");
       }
       System.out.print("\n");
       
    }
    
}

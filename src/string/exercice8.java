package string;
//write a program that can take array of number and calculate the number of bite in an array
import java.util.*;
public class exercice8 {
    public static void main(String[] args) {
        ArrayList<Integer> ar= new ArrayList<>();

        ar.add(5);
        ar.add(3);
        ar.add(1);
        ar.add(6);
        ar.add(7);
        ar.add(4);//->5(21)
        ar.add(2);//6
        ar.add(3);
        ar.add(2);//->8(5)
        ar.add(3);
        ar.add(4);
        ar.add(2);
        ar.add(1);//-->7
        ar.add(1);
        ar.add(0);//-->0

        ArrayList<Integer> l= new ArrayList<>();
        int increment=0;
        for(int i=0;i<ar.size();i++){

            l.add(ar.get(i));

            for(int r=i+1;r<=i+ar.get(i);r++){

                increment=increment+ar.get(r);

            }
            l.add(increment);
            increment=0;
            i=ar.get(i)+i;
        }
        l.forEach(System.out::println);
    
    
}
}

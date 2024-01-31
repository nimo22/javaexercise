package leetcodeeasy;
//https://leetcode.com/problems/hamming-distance/description/
// i can use integer to binary
public class question95 {
    // public int hammingDistance(int x, int y) {

    //     int rest;
    //     String xBinary="";
    //     while (x!=0) {
    //         rest=x%2;
    //         x=x/2;
    //         if(rest==1){
    //             xBinary="1"+xBinary;
    //         }else{
    //             xBinary="0"+xBinary;
    //         }
            
    //     }
    //     xBinary=String.format("%32s", xBinary).replace(" ", "0");
        
    //     String yBinary="";
    //     while (y!=0) {
    //         rest=x%2;
    //         y=y/2;
    //         if(rest==1){
    //             yBinary="1"+yBinary;
    //         }else{
    //             yBinary="0"+yBinary;
    //         }
            
    //     }
    //     yBinary=String.format("%32s", yBinary).replace(" ", "0");


    //     int compare=0;
    //     for(int i=0;i<yBinary.length();i++){
    //         if (yBinary.charAt(i)!=xBinary.charAt(i)) {
    //             compare++;
                
    //         }
    //     }

    //     return compare;
    // }
    public int hammingDistance(int x, int y) {

        String xbinary= Integer.toBinaryString(x);
        String ybinary= Integer.toBinaryString(y);
        System.out.println(ybinary);
        int compare=0;
        for(int i=0;i<ybinary.length();i++){
                    if (ybinary.charAt(i)!=xbinary.charAt(i)) {
                        compare++;
                        
                     }
                 }
    return compare;
    }
}

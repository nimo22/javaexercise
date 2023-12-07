import java.util.*;
class TestAbstraction2{
 public static void main(String args[]){
// test fibonishi
ArrayList<Integer>testfib=new ArrayList<>();  
fibonacci fib = new fibonacci();
testfib=fib.fibo(0, 1, 5);
//for( int i=0;i<testfib.size();i++){
  //  System.out.println(testfib.get(i));
//}
// test fibo recursion
fibonaccirec rec= new fibonaccirec();
//rec.printfib(0, 1);
fibonaccicountreco foborec=new fibonaccicountreco();
//foborec.printd(10);
onlyodd odd= new onlyodd();
 ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(11);
    myNumbers.add(34);
    myNumbers.add(15);
  //  myNumbers.add(12);
//palindorme
palindrome word= new palindrome();
removewhitespace white= new removewhitespace();
//factorial
factorial fac = new factorial();
//System.out.println(fac.printfac(5));
//search tree
binarysearch tree= new binarysearch();
tree.root =tree.insert(10, tree.root);

   tree.insert(30, tree.root);
  tree.insert(8, tree.root);
tree.insert(40, tree.root);
   tree.insert(70, tree.root);
   tree.insert(60, tree.root);
   tree.insert(80, tree.root);
//System.out.println(tree.root.right.key);
//System.out.println(tree.search(60, tree.root));

bubblesort srt= new bubblesort();
myNumbers=srt.bubble(myNumbers);
//for( int i=0;i<myNumbers.size();i++){
  //  System.out.println(myNumbers.get(i));
//}


// merge
mergesort ss=new mergesort();
ss.merge(myNumbers);
 //(int x :myNumbers){
 // System.out.println(x);
 //}
 pyramide pr = new pyramide();
 pr.createpyramide(9);
 System.out.println("");
 pyramidedown down= new pyramidedown();
 down.rev(9);
 pyramidecroissant cr=new pyramidecroissant();
 cr.print(9);
// compare two array list
ArrayList<Integer> myNumberstwo = new ArrayList<Integer>();
    myNumberstwo.add(33);
    myNumberstwo.add(11);
    myNumberstwo.add(34);
    myNumberstwo.add(323);
    myNumberstwo.add(15);
    myNumberstwo.add(354);

    sameelementarray same= new sameelementarray();
    System.out.println(same.sameElement(myNumbers,myNumberstwo));

    sumarray sum = new sumarray();
    sum.sum(myNumberstwo);
    secondelarger second= new secondelarger();
    second.secondelarger(myNumbers);
    pr(); 
    int []x={7,5,9,1,4};
    System.out.println(computeClosestToZero(x));
    

 }
 public static void pr(){
  System.out.println("ss");
 }
   public static int computeClosestToZero(int[] ts) {

        if(ts.length==0){
            return 0;
        }
        
        int initial=Math.abs(ts[0]);
        int test=0;
        int value=0;
        for(int i=0;i<ts.length;i++){
            test=Math.abs(ts[i]);
            if(test<initial){
              initial=test;
                value=i;
            }
        }
        
        return ts[value];
    }
}

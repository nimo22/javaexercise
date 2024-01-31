package leetcodeeasy;
public class question94 {//0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f
    public static String positive(int num) {

        int answer=1;
        String word="";
        while (num>0) {
            answer=num%16;
            num=num/16;
            if(answer<9){
                word=String.valueOf(answer)+word;
            }else if(answer==10){
                word="a"+word;
            }else if(answer==11){
                word="b"+word;
            }else if(answer==12){
                word="c"+word;
            }else if(answer==13){
                word="d"+word;
            }else if(answer==14){
                word="e"+word;
            }else if(answer==15){
            word="f"+word;
            }
        }
           

            return word;
        }
        public static String toHextwo(int num) {
            int answer=1;
            String word="";
            if(num<0){
                num=Math.abs(num);
            }else{
                return positive(num);
            }
            // turning them into binary 
            while (num>0) { 
                answer=num%2;
                num=num/2;
               
                    if(answer==1){
                        word="1"+word;
                    }else{
                        word="0"+word;
                    }
                }  
                System.out.println(word);
                word=word.replace("0", "1");
                System.out.println(word);
                
            
                
                //System.out.println(word);
             
                
                word=String.format("%32s", word).replace(' ', '1');

                int times=1;
               // System.out.println(word);
                int x=0;
                String newWord="";
                int counter=0;
                System.out.println(word);
                for(int i=word.length()-1;i>=0;i--){
                    counter++;
                    System.out.println(word.length());
                    x=x+Integer.valueOf(word.charAt(i)-'0')*times;
                    times=times*2;
                    if (counter==4 ) {
                        counter=0;
                        System.out.println("ok1");
                        System.out.println(positive(x));
                        System.out.println(positive(x));
                        System.out.println("ok2");
                        
                        newWord=positive(x)+newWord;
                        x=0;
                        times=1;
                    }
                    
                    
                }
                


               
                

                
                
            
            
            //binary to hexadecimal

            
               
    
                return newWord;
            }
        public static void main(String[] args) {
            String s=toHextwo(-4);
            System.out.println(s);
        }
        
    }

    


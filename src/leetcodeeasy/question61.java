package leetcodeeasy;

public class question61 {
    public int firstBadVersion(int n) {
        if(n==1){
            return 1;
        }
        int finish=n;
        int start=1;
       while (isBadVersion(n/2)) {
        
       }System.out.println();
        for(int i=start;i<=finish;i++){
            if(isBadVersion(i)){
                return i;
            }
        }
        return 0;
}

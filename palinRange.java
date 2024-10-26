package mathematics;
import java.util.*;
public class palinRange {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        for(int i=r1; i<=r2; i++){
            if(p(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean p(int i){
        int n=i;
        int rev=0;
        int c;
        while(n!=0){
            c=n%10;
            rev=rev*10+c;
            n=n/10;
        }
        return (i==rev);
        
    }
}
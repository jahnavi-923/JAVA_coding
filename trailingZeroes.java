package mathematics;
import java.util.*;
public class trailingZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(count(n));

    }
    public static int count(int n){
        int res = 0;
        for(int i=5;i<=n; i=i*5){
            res = res+n/i;
            
        }return res;
    }
}
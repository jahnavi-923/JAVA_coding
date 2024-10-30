package mathematics;
import java.util.*;
public class computigPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // in the form of a power n
        int a = sc.nextInt();
        int n = sc.nextInt();
        int res=1;
        for(int i=0; i<n;i++){
            res *= a;
        }
        System.out.println(res);
    }
}
